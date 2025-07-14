# 🍽️ Restaurant Rating App

This Java project allows users to register and view restaurants with their respective ratings, following key Java backend principles like collection management, ordering, and data integrity.

---

## 📖 Exercise Statements

### 🧪 Exercise 1

Create a class named `Restaurant` with two attributes: `name` (String) and `rating` (int).
Implement the necessary methods to **prevent inserting Restaurant objects with the same name and the same rating** into a `HashSet` created in the `main()` method.

> **Important:**
> There may be restaurants with the **same name but different ratings**,
> but **not** restaurants with both the **same name and same rating**.

---

### 🧪 Exercise 2

Using the class from the previous exercise, implement the logic so that `Restaurant` objects are **sorted by name** and, in case of a tie, by **rating in descending order**.

**Example:**

```
name: restaurant1, rating: 8  
name: restaurant1, rating: 7
```

---

## 🧠 Learning Outcomes

- Implementing `Comparable<T>` for custom sort order
- Understanding how `HashSet` and `TreeSet` handle uniqueness
- Managing user input safely with `Scanner`
- Encapsulation and clean method separation

---

## 💻 Technologies

- Java 21
- IntelliJ IDEA
- Maven (Project structure)
- Git for version control

---

## 🛠️ How to Run

1. Clone the repository:
```bash
git clone https://github.com/alaw810/1.3-JavaLanguage-Level2.git
```

2. Open the project in IntelliJ IDEA

3. Run the `Main` class

---

## 📁 Project Structure

```
src/
└── main/
    └── java/
        └── com/
            └── alaw810/
                ├── Restaurant.java
                └── Main.java
```

---
## 📋 Requirements

- Java SDK 21 or higher
- An IDE like IntelliJ IDEA or Eclipse
- Git installed (optional)

---

## 🛠️ Installation

1. Clone the repository (if available):

   ```bash
   git clone https://github.com/alaw810/1.3-JavaLanguage-Level2.git

2. Open the project in IntelliJ IDEA:

   File → Open → Select the project folder

3. Set the correct Java SDK:

   File → Project Structure → SDKs → Java 21+

---

## ▶️ Execution

1. Open the `Main.java` file

2. Run the `main()` method

3. You will be prompted to add restaurants and view them sorted

---


## 🌐 Deployment

This is a console-based educational Java application and doesn't require production deployment.
If desired, you can compile and run it manually:

```bash
javac com/alaw810/*.java
java com.alaw810.Main
```

Or export it as a `.jar` file using IntelliJ IDEA.

---

## 🤝 Contributions

This is a learning project for academic practice.
However, improvements are welcome!

1. Fork the repo

2. Create a new branch (`git checkout -b feature/your-feature`)

3. Commit and push your changes

4. Open a Pull Request
