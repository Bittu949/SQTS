# Task-05 : Bank Account Management System

## 📖 Project Description
This project is a Spring Boot web application that simulates a basic Bank Account Management System.  
Users can create an account, deposit money, withdraw money, and view transaction history.

The system enforces a minimum balance rule and maintains account state using session management.

This project demonstrates business rule implementation, session handling, and dynamic UI updates using Spring MVC and Thymeleaf.

---

## 🚀 Features

The application provides the following functionalities:

- Create account with minimum balance ₹3000
- View current balance
- Deposit money
- Withdraw money (while maintaining minimum balance)
- Transaction history tracking
- Session-based account management
- Responsive and clean UI

---

## 🏦 Business Rules Implemented

- Minimum account balance must be ₹3000
- Withdrawal is allowed only if balance remains ≥ ₹3000
- All transactions are stored and displayed
- Balance updates dynamically after each transaction

---

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring MVC
- Thymeleaf
- Maven
- HTML5
- CSS3
- HttpSession (Session Management)

---

## 🏗 Architecture Overview

The application follows layered MVC architecture:

- **Controller Layer** → Handles HTTP requests  
- **Service Layer** → Implements banking logic  
- **Session Layer** → Maintains account state  
- **View Layer (Thymeleaf)** → Displays dynamic data  

### Flow:

1. User creates account with initial balance.
2. Account details stored in session.
3. User performs deposit or withdrawal.
4. Service validates business rules.
5. Balance and transaction history update.
6. UI reflects updated account information.

---

## ▶ How to Run

### Using IDE
1. Open project in IntelliJ or any IDE.
2. Run the Spring Boot main application class.
3. Open browser and visit: http://localhost:8080/

---

## 👤 Author
**Balkrishna Naik**  
Java Full-Stack Intern
