

---

# 🚀 Elevator Algorithm in Java

This project implements a **dynamic elevator scheduling algorithm** in Java, simulating the path and logic of an elevator based on incoming requests and direction.

---

## ✨ Features

* Handles **dynamic floor requests** during the elevator journey.
* Moves only to **requested floors**, avoiding unnecessary stops.
* Supports **direction-based scheduling** (up or down) similar to SCAN algorithm.
* Automatically **reverses direction** when no further requests exist in the current direction.
* Uses **ArrayList** for efficient request management and sorting.

---

## 🔧 How It Works

1. **Requests** are added dynamically via the `requestFloor()` method.
2. The elevator maintains:

   * `currentFloor` – its current position.
   * `direction` – current direction ("up" or "down").
   * `requests` – list of pending floor requests.
3. Processes requests in the current direction:

   * **Ascending order** when going up.
   * **Descending order** when going down.
4. If no requests remain in the current direction, it **reverses direction**.
5. Upon reaching a requested floor, it **removes it from the queue**.

---

## 💻 Usage

### 🔨 Compilation

```bash
javac ElevatorSystem.java
```

### 🚀 Run

```bash
java ElevatorSystem
```

### 📝 Example Usage

```java
ElevatorSystem elevator = new ElevatorSystem();
elevator.requestFloor(5);
elevator.requestFloor(3);
elevator.requestFloor(8);
elevator.processRequests();
```

---

## 📂 Files

* `ElevatorSystem.java` : Contains the elevator algorithm implementation.
* `README.md` : Project documentation.

---

## 🧠 Concepts Used

* **ArrayList** for dynamic data storage.
* **Sorting algorithms** for direction-based traversal.
* **While loops and conditionals** for continuous processing.
* **Object-Oriented Programming (OOP)** to encapsulate elevator logic within a class.

---

## 🚧 Future Enhancements

* Multi-elevator system with optimal car assignment.
* Real-time simulation with threading.
* GUI integration using **JavaFX or Swing** for visualization.
* REST API backend for **smart building elevator control systems**.

---

## 📜 License

This project is for **educational and demonstration purposes** under Data Structures, Algorithms, and Java OOP learning.

---

## 👨‍💻 Author

**Vansh Pandey**
*BTech CSE | AI-ML | Space & Research Enthusiast*

> **“Elevators teach us – when requests align with direction, journeys become efficient.”**

---

### ⭐ Feel free to use, extend, or integrate this algorithm in your college projects, OS simulations, or smart building backend modules.


