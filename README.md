🎨 Virtual Art Gallery
The Virtual Art Gallery is a full-stack web application that empowers Artists to showcase and sell their digital artwork, while allowing Buyers to explore, purchase, and securely download artworks. An Admin role is also included to oversee and manage platform operations.

👥 User Roles

1.  Artist
    Upload, update, and delete artworks.
    View orders and earnings reports.

2. Buyer
    Browse and search artworks.
    Add to cart, checkout, and make secure payments.
    Download purchased digital art.

3.  Admin
    Manage users and artworks.
    Monitor platform activity.

🔐 Key Features

🔑 Secure JWT-based authentication
🛡️ Role-based authorization (Artist, Buyer, Admin)
🖼️ Artwork management with Cloudinary integration
🛒 Shopping cart and Stripe-powered checkout
📥 Secure download of purchased artworks
📊 Order history and earnings tracking for Artists
📁 RESTful APIs with Spring Boot and Hibernate
⚙️ Modular and scalable architecture

🛠️ Tech Stack

    Frontend	Backend	Integrations & Tools
    React.js	Spring Boot	Stripe (Payment Gateway)
    HTML, CSS	Hibernate, JPA	Cloudinary (Artwork Hosting)
    Axios	MySQL	JWT (Security Authentication)

🚀 Getting Started

📦 Prerequisites
    ReactJs (v16+ recommended)
    Java (JDK 17+)
    Maven
    MySQL Server

🔧 Backend Setup
cd Backend/Virtual_Art_GalleryFinal/virtualartgallery
mvn clean install
mvn spring-boot:run

💻 Frontend Setup
cd Frontend/firstapp
$env:NODE_OPTIONS="--openssl-legacy-provider"
npm install
npm start

📄 License
This project is licensed under the MIT License.
See the LICENSE file for more information.