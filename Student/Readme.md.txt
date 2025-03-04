# Student Management System

## Overview
This is a simple Java-based **Student Management System** that allows users to add, view, search, update, and delete student records. The system operates via a console-based menu.

## Features
- **Add Student**: Add a new student with Name, PRN, DOB, and Marks.
- **Display Students**: Show all students currently in the system.
- **Search by PRN**: Find a student using their PRN.
- **Search by Name**: Retrieve a list of students with a matching name.
- **Search by Position**: Get a student record based on their position in the list.
- **Update Student**: Modify an existing student's details.
- **Delete Student**: Remove a student from the system.
- **Exit**: Close the application.

## File Structure
- **Main.java**: Contains the main method with a menu-driven interface for user interaction.
- **Student.java**: Defines the `Student` class with attributes, validation, and a display method.
- **StudentOperation.java**: Handles operations such as adding, searching, updating, and deleting students.

## How to Run
1. Ensure you have **Java installed** on your system.
2. Compile the files using:
   ```sh
   javac Main.java Student.java StudentOperation.java
   ```
3. Run the program using:
   ```sh
   java Main
   ```
4. Follow the on-screen menu to perform various student management operations.

## Validation Rules
- **Name**: Must contain only alphabets and be between 3 and 50 characters.
- **PRN**: Must be an 11-digit positive number.
- **DOB**: Must be in `YYYY-MM-DD` format.
- **Marks**: Must be between `0-100`, with at most one decimal place.

## Example Usage
```
1. Add Student
2. Display Students
3. Search by PRN
4. Search by Name
5. Search by Position
6. Update Student
7. Delete Student
8. Exit
Enter choice: 1
Enter Name: John Doe
Enter PRN: 12345678901
Enter DOB (YYYY-MM-DD): 2002-05-10
Enter Marks: 85.5
Student added successfully.
```