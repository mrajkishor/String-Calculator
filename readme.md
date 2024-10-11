# 🌟 String Calculator TDD Kata

Welcome to the **String Calculator TDD Kata** project. This repository showcases a disciplined approach to software craftsmanship using Test-Driven Development (TDD) principles.

![TDD](https://img.shields.io/badge/TDD-Passed-brightgreen) ![Java](https://img.shields.io/badge/Java-11%2B-blue) ![JUnit](https://img.shields.io/badge/JUnit-5-orange) ![License](https://img.shields.io/badge/License-MIT-yellow)

## 📚 Project Overview

The **String Calculator** is a simple utility that takes a string of numbers and returns their sum. It handles various delimiters, supports flexible input formats, and manages error cases such as negative numbers.

This project emphasizes the **Red-Green-Refactor** cycle of TDD to ensure the highest code quality and reliability.

## ✨ Features
- **Empty Input Handling**: Returns `0` for an empty string.
- **Comma & New Line Delimiters**: Supports comma `,` and new line `\n` delimiters.
- **Custom Delimiters**: Allows custom delimiters using the format `//[delimiter]\n`.
- **Error Handling**: Throws exceptions for negative numbers with a detailed message.

## 🚀 Getting Started

### Prerequisites
- **Java 11** or higher installed
- A Java IDE like **IntelliJ IDEA** or **Eclipse**
- **Maven** or **Gradle** for dependency management

### Installation

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/mrajkishor/String-Calculator.git
   cd StringCalculatorTDD
   ```
2. **Open the project in Java IDE**
3. **Build the Project:**
   - Using Maven
   ```bash
    mvn clean install
   ```
   - Using Gradle
   ```bash
   ./gradlew build 
   ``` 
4. **Running the Tests:**
   - Using Maven
   ```bash
    mvn test
   ```
   - Using Gradle
   ```bash
    ./gradlew test
   ``` 

## 🛠️ TDD Workflow

This project was developed using the TDD Red-Green-Refactor cycle:

- Red: Write a failing test case.
- Green: Write the minimum code to make the test pass.
- Refactor: Clean up the code while keeping all tests green. 

> **Commit History**: Every commit in this repository reflects incremental steps following the TDD principles, showcasing the thought process and evolution of the codebase.

---


📧 Contact
Email: mrajkishor331@gmail.com