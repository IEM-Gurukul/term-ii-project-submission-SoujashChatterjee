# PCCCS495 – Term II Project

## Project Title
Smart Hostel and Room Allocation System

---

## Problem Statement
Managing hostel room allocation manually in colleges often leads to inefficiencies, errors in record keeping, and difficulty in tracking room availability. Administrators face challenges in assigning rooms, maintaining student records, and updating data when students vacate rooms.

This project aims to automate hostel management by implementing a structured system that handles student information, room allocation, and occupancy tracking. The system ensures efficient allocation using preference-based logic and maintains data consistency through validation and persistence mechanisms.

---

## Target User

### Primary Users
- Hostel wardens  
- Hostel administrators  
- College management  

### Secondary Users
- Students learning Object-Oriented Programming  
- Developers exploring modular system design  

---

## Core Features

### Student Management
- Add student with unique ID validation  
- Search student by ID  
- Remove (vacate) student  

### Room Allocation System
- Preference-based allocation (Single / Double / Triple)  
- Random allocation if preference unavailable  
- Capacity-based room management  
- Room change/upgrade functionality  

### Room & Floor Management
- Floor-wise hostel structure  
- Room-wise student display  
- Real-time occupancy tracking  

### Role-Based Access Control
- Admin and User roles  
- Secure admin login (username and password)  
- Restricted operations for non-admin users  

### Data Persistence
- File-based storage using text file  
- Automatic loading of saved data  
- Data retained across program executions  

### Input Validation & Error Handling
- Unique ID enforcement  
- Name validation (alphabets only)  
- Department selection validation  
- Exception handling using try-catch  

---

## Object-Oriented Programming Concepts Implemented

### Abstraction
- Base classes define common structure for system entities  

### Inheritance
- Room hierarchy: SingleRoom, DoubleRoom, TripleRoom extend Room  
- Student extends Person (if implemented)  

### Polymorphism
- Room types override displayRoomDetails() method  

### Encapsulation
- Data members are private and accessed through getters/setters  

### Exception Handling
- Robust input validation using try-catch blocks  

### Collections
- ArrayList used for managing students, rooms, and floors  

---

## Architecture Overview

The system follows a modular layered architecture:

- Model Layer: Represents entities like Student, Room, and Floor  
- Service Layer: Handles business logic through HostelManager  
- Repository Layer: Manages file operations using FileHandler  
- Security Layer: Handles authentication and role-based access  
- Main Layer: Controls program execution and user interaction  

---

## Project Structure

SmartHostelSystem/
│
├── data/
│   └── students.txt
│
└── src/
    └── hostel/
        ├── Main.java
        │
        ├── model/
        │   ├── Person.java
        │   ├── Student.java
        │   ├── Room.java
        │   ├── SingleRoom.java
        │   ├── DoubleRoom.java
        │   ├── TripleRoom.java
        │   └── Floor.java
        │
        ├── service/
        │   └── HostelManager.java
        │
        ├── repository/
        │   └── FileHandler.java
        │
        ├── security/
        │   └── AuthService.java

---

## Technical Stack

### Language & Runtime
- Java (JDK 11 compatible)

### Libraries & APIs
- Collections: ArrayList  
- File Handling: BufferedReader, BufferedWriter  
- Input Handling: Scanner  

---

## Execution Instructions

### Using Command Line

1. Navigate to the project directory  

2. Compile the project:
javac *.java

3. Run the program:
java Main

---

## Git Discipline & Development
- Incremental commits for each feature  
- Meaningful commit messages  
- Logical progression of development  
- More than 10 commits maintained  

---

## Notes
- Student ID must be unique  
- Department can be skipped (stored as NIL)  
- Data is stored in students.txt  
- System supports multiple floors and room types  
- Admin authentication is required for critical operations  