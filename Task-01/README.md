# Task-01 : Java Fundamentals & Logic Building

## 📖 Project Description
This project is a Spring Boot web application that performs fundamental Java logic operations through a simple and interactive web interface.  
It demonstrates backend logic implementation using Spring MVC architecture with Thymeleaf for dynamic UI rendering.

---

## 🚀 Features

The application allows users to:

- Check whether a number is Even or Odd
- Check whether a number is Prime
- Generate Fibonacci series up to N terms
- Check whether a number is a Palindrome

Users enter a number, select an operation, and view the result instantly on the same page.

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

- **Controller Layer** → Handles HTTP requests and responses  
- **Service Layer** → Contains business logic  
- **View Layer (Thymeleaf)** → Renders dynamic content  

Flow:

1. User submits form.
2. Request is handled by `MainController`.
3. Controller calls `MainService`.
4. Service processes logic.
5. Result is returned to the view.

---

## ▶ How to Run

### Prerequisites
- Java 17 or higher installed

---

### 1️⃣ Navigate to this project folder

If you cloned the main repository:

```bash
cd SQTS/Task-01
```

---

### 2️⃣ Run the application using Maven Wrapper

For Mac/Linux / Git Bash:

```bash
./mvnw spring-boot:run
```

For Windows CMD:

```bash
mvnw.cmd spring-boot:run
```

---

### 3️⃣ Open in browser

http://localhost:8080


## 👤 Author
Balkrishna Naik  
Java Full-Stack Intern
