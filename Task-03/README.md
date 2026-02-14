# Task-03 : Menu Driven Calculator

## 📖 Project Description
This project is a Spring Boot web application that implements a menu-driven calculator.  
It allows users to perform basic arithmetic operations through a user-friendly web interface built using Thymeleaf.

The application demonstrates handling form input, implementing conditional logic, and applying MVC architecture using Spring Boot.

---

## 🚀 Features

The calculator supports the following operations:

- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/)
- Percentage (%)

Additional features:

- Handles division by zero safely
- Displays result dynamically on the same page
- Clean and responsive UI design

---

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring MVC
- Thymeleaf
- Maven
- HTML5
- CSS3

---

## 🏗 Architecture Overview

The application follows a layered architecture:

- **Controller Layer** → Handles HTTP requests and form submission  
- **Service Layer** → Contains business logic for arithmetic operations  
- **View Layer (Thymeleaf)** → Renders dynamic results  

### Flow:

1. User enters two numbers.
2. User selects an operation.
3. Form submits to `/calculate`.
4. Controller calls the service layer.
5. Service performs the requested operation.
6. Result is displayed on the same page.

---

## ▶ How to Run

### Using IDE
1. Open the project in IntelliJ or any IDE.
2. Run the Spring Boot main application class.
3. Open browser and visit: http://localhost:8080/

---

## 👤 Author
**Balkrishna Naik**  
Java Full-Stack Intern
