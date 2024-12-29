# Quiz Application

This is a simple Java-based console application that presents a quiz to the user. It allows the user to answer multiple-choice questions and displays their score at the end.

## Features

- Displays a set of multiple-choice questions.
- Accepts user input to select an answer for each question.
- Validates the answers and provides immediate feedback (correct or incorrect).
- Displays the final score at the end of the quiz.

---

## Prerequisites

To run this application, you need:

1. Java Development Kit (JDK) installed on your system.
2. A text editor or IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code) for compiling and running the code.

---

## How to Run

1. **Clone or download the repository:**
   ```bash
   git clone <repository-url>

2. **Compile the Java files: Navigate to the directory where the files are located and run:**
   ```bash
    javac Main.java

3. **Run the application: After compiling, execute the program using:**
    ```bash
    java Main

---

## How It Works

The application initializes a set of five predefined questions in the QuestionService class.
Each question has:
A unique ID
The question text
Four multiple-choice options
The index of the correct answer
When the application runs:
Each question is displayed sequentially.
The user is prompted to input their answer (1-4).
Immediate feedback is provided for each answer (correct or incorrect).
At the end of the quiz, the user's score is displayed.

## Example Output
```text
Who developed the Java programming language?
1 : Dennis Ritchie
2 : James Gosling
3 : Bjarne Stroustrup
4 : Guido van Rossum
Enter Your answer from 1 to 4: 2
You are correct!

------------------------------------------------------------
Which of the following is not a Java feature?
1 : Platform Independence
2 : Object-Oriented
3 : Supports Pointers
4 : Multithreading
Enter Your answer from 1 to 4: 3
You are correct!

------------------------------------------------------------
Your score is 5/5!
