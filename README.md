# 🎮 Tic-Tac-Toe Android App

A simple and interactive **Tic-Tac-Toe game** built using Android (Java).
This app allows two players to play on the same device with a clean UI and smooth gameplay.

---

## 🚀 Features

* ❌⭕ Two-player mode (Player X vs Player O)
* 🎯 Real-time turn indicator
* 🏆 Winner detection (rows, columns, diagonals)
* 🤝 Draw detection
* 🔄 Restart game button
* 🎨 Color-coded players (X and O)
* ⚡ Fast and responsive UI

---

## 🛠️ Technologies Used

* **Java (Android)**
* **XML (UI Design)**
* **GridLayout** for game board

---

## 📂 Project Structure

```id="str001"
TicTacToeApp/
│── app/
│   ├── java/com/example/tictactoe/
│   │   └── MainActivity.java
│   ├── res/layout/
│   │   └── activity_main.xml
│   ├── res/values/
│   │   └── styles.xml
│── AndroidManifest.xml
│── build.gradle
```

---

## 📸 UI Overview

* Dark theme interface 🌙
* 3x3 grid game board
* Status text showing current turn or result
* Restart button for new game

---

## ⚙️ How It Works

* The board is stored in a **2D array**
* Each button represents a cell
* Players take turns placing **X** or **O**
* After every move:

  * The app checks for a winner
  * If no winner → checks for draw
* Game ends when:

  * A player wins 🎉
  * OR the board is full 🤝

---

## 🧠 Logic Highlights

* ✔ Uses `String[][] board` to track moves
* ✔ Prevents clicking on already filled cells
* ✔ Efficient winner checking using loops
* ✔ Disables buttons after move
* ✔ Game state management using flags (`gameOver`)

---

## ▶️ How to Run

1. Clone the repository:

```id="run001"
git clone https://github.com/your-username/TicTacToeApp.git
```

2. Open in **Android Studio**

3. Sync Gradle

4. Run the app on:

   * Emulator
   * OR Physical device

---

## 🔄 Game Rules

* Player X starts first
* Players alternate turns
* First to get 3 in a row (horizontal, vertical, diagonal) wins
* If all cells are filled → Draw

---

## 📌 Future Improvements

* 🤖 Add AI (single-player mode)
* 🎨 Add animations and sound effects
* 🌗 Dark/Light theme toggle
* 📊 Score tracking system

---

## 👨‍💻 Author

**Hafiza Ghulam Fatima**


---
