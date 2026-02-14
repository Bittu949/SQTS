# Task-04 : Number Guessing Game

## 📖 Project Description
This project is a Spring Boot web application that implements an interactive Number Guessing Game.  
Players attempt to guess a randomly generated number between 0 and 100. The application provides hints, tracks attempts, maintains guess history, and stores leaderboard rankings.

This project demonstrates session management, dynamic UI updates, state handling, and real-time data tracking using Spring MVC and Thymeleaf.

---

## 🚀 Features

The game provides the following functionalities:

- Player name registration
- Random number generation (0–100)
- Hint system:
  - Too High
  - Too Low
  - Very Close
- Attempt counter tracking
- Current game guess history display
- Past game attempt tracking
- Full guess history per game
- Leaderboard (Best attempts per player)
- Reset / New Game option

Leaderboard updates automatically when a player achieves a better score.

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

- **Controller Layer** → Handles HTTP requests and session data  
- **Service Layer** → Contains game logic and leaderboard management  
- **Session Layer** → Maintains game state per user  
- **View Layer (Thymeleaf)** → Renders dynamic game updates  

### Flow:

1. Player enters name and starts the game.
2. System generates a random number (0–100).
3. Player submits guesses.
4. Service:
   - Compares guess with random number
   - Provides hints
   - Updates attempt count
   - Stores guess history
   - Updates leaderboard
5. UI dynamically updates game state.
6. Player can reset to start a new game.

---

## 🏆 Leaderboard Logic

- Stores best attempt count per player.
- Updates only if a player beats their previous best score.
- Displays ranked leaderboard on UI.

---

## ▶ How to Run

### Prerequisites
- Java 17 or higher installed

---

### 1️⃣ Navigate to this project folder

If you cloned the main repository:

```bash
cd SQTS/Task-04
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
