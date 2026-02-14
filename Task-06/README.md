# Task-06 : Student Management System (OOP Based)

## 📖 Project Description
This project is a Spring Boot web application that implements a Student Management System using Object-Oriented Programming principles.

The system allows users to perform full CRUD (Create, Read, Update, Delete) operations on student records.  
Student data is stored in-memory using an ArrayList, and all operations are handled through a layered MVC architecture.

This project demonstrates clean OOP design, validation logic, CRUD handling, and dynamic UI rendering using Spring MVC and Thymeleaf.

---

## 🚀 Features

The application provides the following functionalities:

- Add new student
- View all students
- Update student details
- Delete student
- Validate duplicate Student IDs
- Partial update support (update only provided fields)
- Responsive and clean UI

---

## 🧑‍🎓 Student Attributes

Each student record contains:

- Student ID (Unique)
- Name
- Email
- Course
- Marks (0–100)

---

## 🛠 Technologies Used

- Java
- Spring Boot
- Spring MVC
- Thymeleaf
- Maven
- HTML5
- CSS3
- OOP Principles

---

## 🏗 Architecture Overview

The application follows layered MVC architecture:

- **Controller Layer** → Handles HTTP requests and responses  
- **Service Layer** → Contains business logic and validations  
- **Entity Layer** → Student class (OOP model representation)  
- **View Layer (Thymeleaf)** → Renders dynamic data  

### Flow:

1. User submits student details.
2. Controller receives request under `/students`.
3. Service performs:
   - Validation checks
   - Duplicate ID check
   - CRUD operations
4. Updated student list is returned to the view.
5. UI dynamically updates.

---

## 🧠 OOP Concepts Demonstrated

- Encapsulation (Student Entity class)
- Data abstraction
- Object manipulation
- Use of ArrayList for dynamic storage
- Iterator usage
- removeIf() method
- Validation logic implementation

---

## ▶ How to Run

### Prerequisites
- Java 17 or higher installed

---

### 1️⃣ Navigate to this project folder

If you cloned the main repository:

```bash
cd SQTS/Task-06
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
