package com.virtualartgallery.service;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.virtualartgallery.repository.UserRepository;
import com.virtualartgallery.dto.UserDto;
import com.virtualartgallery.entity.Artwork;
import com.virtualartgallery.entity.Order;
import com.virtualartgallery.entity.OrderStatus;
import com.virtualartgallery.entity.User;
import com.virtualartgallery.repository.ArtworkRepository;
import com.virtualartgallery.repository.OrderRepository;

@Service
public class AdminDashboardService {

    private final OrderRepository orderRepository;
    private final UserRepository userRepository;

    private final ArtworkRepository artworkRepository;
    
    @Autowired
    public AdminDashboardService(OrderRepository orderRepository, UserRepository userRepository,
                                 ArtworkRepository artworkRepository) {
        this.orderRepository = orderRepository;
        this.userRepository = userRepository;
        this.artworkRepository = artworkRepository;
    
    }

    public Map<String, Long> getDashboardStats() {
        Map<String, Long> stats = new HashMap<>();
    
        // ✅ Get today's date at 00:00 (midnight)
        LocalDateTime startOfDay = LocalDateTime.now().toLocalDate().atStartOfDay();
    
        // ✅ Users who registered today
        stats.put("usersRegisteredToday", userRepository.countByRegistrationDateAfter(startOfDay));
    
        // ✅ Users who logged in today
        stats.put("usersLoggedInToday", userRepository.countByLastLoginAfter(startOfDay));
    
        // ✅ Artworks uploaded today
        stats.put("artworksUploadedToday", artworkRepository.countByCreatedAtAfter(startOfDay));
    
        // ✅ Artworks sold today
        stats.put("artworksSoldToday", orderRepository.countByOrderDateAfter(startOfDay));
    
        // ✅ Completed and failed orders
        stats.put("totalCompletedOrders", orderRepository.countByOrderStatus(OrderStatus.COMPLETED));  
        stats.put("totalFailedOrders", orderRepository.countByOrderStatus(OrderStatus.CANCELLED));  
    
        return stats;
    }
    

    // Fetch all users
    public List<UserDto> getAllUsers() {
    List<User> users = userRepository.findAll();
    return users.stream()
            .map(user -> new UserDto(
                    user.getId(), 
                    user.getUsername(), 
                    user.getRole(), 
                    user.getRegistrationDate(), 
                    user.getLastLogin()))
            .collect(Collectors.toList());
}

    // Delete user by ID
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
        
    }

    // Fetch all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Update order status
    public void updateOrderStatus(Long orderId, OrderStatus status) {
        Order order = orderRepository.findById(orderId).orElseThrow(() -> new RuntimeException("Order not found"));
        order.setOrderStatus(status);
        orderRepository.save(order);
    }

    // Fetch all artworks
    public List<Artwork> getAllArtworks() {
        return artworkRepository.findAll();
    }

    // Delete artwork by ID
    public void deleteArtwork(Long artworkId) {
        artworkRepository.deleteById(artworkId);
    }

}
