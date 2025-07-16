# 🎨 Virtual Art Gallery

The **Virtual Art Gallery** is a full-stack web application where **Artists** can showcase and sell their artwork, and **Buyers** can explore, purchase, and securely download digital art. It also includes an admin role for platform monitoring.

---

## 👥 User Roles

- **Artist**: Upload, update, delete artwork, view sales and orders.
- **Buyer**: Browse art, add to cart, pay via Stripe, download purchased art.
- **Admin**: Manage users and artworks.

---

## 🔐 Features

- Secure **JWT authentication**
- **Role-based access** for users
- **Artwork management** (upload, edit, delete)
- **Shopping cart** and **checkout system**
- **Stripe payment integration**
- **Download access** only after payment
- **Order and earnings tracking**
- Cloudinary image hosting

---

## 🛠️ Tech Stack

| Frontend        | Backend          | Others                      |
|-----------------|------------------|-----------------------------|
| React.js        | Spring Boot      | Stripe (Payment Gateway)    |
| HTML, CSS       | Hibernate, JPA   | Cloudinary (File Storage)   |
| Axios           | MySQL            | JWT (Security)              |

---

## 🚀 How to Run the Project

###  Backend
```bash in vscode
cd Backend/Virtual_Art_GalleryFinal/virtualartgallery
mvn clean spring-boot:run


###  Frontend
```bash in vscode
cd Frontend/firstapp/$env:NODE_OPTIONS="--openssl-legacy-provider"
npm start

## 📄 License

This project is licensed under the **MIT License**.  
See the [LICENSE](./LICENSE) file for full details.
