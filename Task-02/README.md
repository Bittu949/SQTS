
# Task-02 : Student Grade Management Program

## 📖 Project Description
This project is a Spring Boot web application designed to manage student academic records.  
It allows users to add student details along with marks for five subjects, automatically calculates total marks, percentage, grade, and assigns ranks dynamically.

The application demonstrates real-world data processing, ranking logic, and layered architecture using Spring MVC and Thymeleaf.

---

## 🚀 Features

The application provides the following functionalities:

- Add student details (Name, Roll Number, Class)
- Enter marks for 5 subjects
- Automatically calculate:
  - Total Marks
  - Percentage
  - Grade (F to A+)
  - Rank
- Display:
  - Latest student result sheet
  - Top 3 rankers
  - Complete rank-wise student list

All ranking updates dynamically whenever a new student is added.

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

- **Controller Layer** → Handles HTTP requests and form submissions  
- **Service Layer** → Contains business logic (calculation, sorting, ranking)  
- **Entity Layer** → Represents Student data model  
- **View Layer (Thymeleaf)** → Renders dynamic UI  

### Flow:

1. User submits student details.
2. Controller receives data via `/students`.
3. Service:
   - Calculates total
   - Calculates percentage
   - Assigns grade
   - Sorts students
   - Assigns rank
4. Updated student list is displayed on UI.

---

## 📊 Grading Criteria

| Percentage Range | Grade |
|------------------|--------|
| Below 50%        | F      |
| 50% - 59%        | D      |
| 60% - 69%        | C      |
| 70% - 79%        | B      |
| 80% - 89%        | A      |
| 90% and above    | A+     |

---

## ▶ How to Run

### Prerequisites
- Java 17 or higher installed

---

### 1️⃣ Navigate to this project folder

If you cloned the main repository:

```bash
cd SQTS/Task-02
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
