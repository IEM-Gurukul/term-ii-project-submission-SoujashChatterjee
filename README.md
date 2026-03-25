# Title
 Smart Hostel and Room Allocation System

## Problem Statement
Managing hostel room allocation manually often leads to inefficiencies, errors in record keeping, and difficulty in tracking room availability. Administrators face challenges in assigning rooms, maintaining student data, and updating records when changes occur. This project aims to automate hostel management using a structured, object-oriented approach. The system efficiently manages student details, room allocation, and occupancy while ensuring data persistence and validation, reducing manual effort and improving accuracy.



## Target Users
- Hostel Wardens  
- Hostel Administrators  
- College Management  



## Core Features
- Add student with unique ID validation  
- Floor-wise hostel structure (3 floors)  
- Room types: Single, Double, Triple (capacity-based allocation)  
- Preference-based room allocation with random fallback  
- Department selection (CSE, Mechanical, Electrical, Electronics, or NIL)  
- View student and room details  
- File handling for saving and loading data  
- Exception handling for invalid inputs  
- Clear all data option for new session  



## OOP Concepts Used
- **Abstraction**: Person class defines common attributes  
- **Inheritance**: Student extends Person; room types extend Room  
- **Polymorphism**: Different room types override display methods  
- **Encapsulation**: Private variables accessed via getters/setters  
- **Collections**: ArrayList used for managing students, rooms, and floors  



## Architecture Description
The system follows a modular object-oriented design. The `Person` class acts as a base class, while `Student` extends it to include specific attributes. The `Room` class is further extended into `SingleRoom`, `DoubleRoom`, and `TripleRoom` to demonstrate polymorphism. Rooms are grouped into `Floor` objects, creating a hierarchical structure. The `HostelManager` class handles all core operations such as student addition, allocation, and display. The `FileHandler` class manages data persistence by saving and loading records from a file. The `Main` class provides a menu-driven interface for user interaction.



## How to Run Instructions

1. Open the project in any Java IDE (VS Code / IntelliJ / Eclipse)

2. Ensure all files are in the same source folder:
   - Main.java  
   - HostelManager.java  
   - Student.java  
   - Person.java  
   - Room.java  
   - SingleRoom.java  
   - DoubleRoom.java  
   - TripleRoom.java  
   - Floor.java  
   - FileHandler.java  

3. Compile the program:

4. Run the program:

5. Follow the menu options:
- Add Student  
- View Rooms  
- View Students  
- Clear Data  
- Exit  



## Notes
- Student ID must be unique  
- Name accepts only alphabets  
- Department can be skipped (stored as NIL)  
- Data is saved in `students.txt` file  
- System supports more than 18 students using multiple floors  
