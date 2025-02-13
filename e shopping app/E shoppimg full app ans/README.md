# E-Shopping Mall Application

## Project Description
The E-Shopping Mall application is designed to facilitate online shopping by allowing customers to browse products, manage their shopping carts, and complete transactions. It also provides administrative features for managing products and sales data.

## Modules Overview
- **Customer Module**: Allows users to register, log in, view products, add items to the cart, and checkout.
- **Manager Module**: Enables administrators to manage product listings, view sales reports, and handle user inquiries.
- **Product Search Module**: Allows users to search for products based on categories and availability.
- **Billing Module**: Manages the shopping cart, calculates totals, and processes payments.

## Installation Instructions
1. Clone the repository.
2. Navigate to the project directory.
3. Update `application.properties` with your database credentials and settings.
4. Run `mvn clean install` to build the project.
5. Run `mvn spring-boot:run` to start the application.

## Usage
- Access the application at `http://localhost:8080`.
- Register a new account or log in with existing credentials.
- Browse products, add them to the cart, and proceed to checkout.

## Deployment Guide
- Prepare the application for deployment using `mvn package`.
- Deploy the generated JAR file on a server or cloud service.

## License Information
This project is licensed under the MIT License.
