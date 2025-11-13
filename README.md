# Student Record Management System

## Problem Statement
Implement a Student Record Management System with persistent storage
using file handling and Java Collections Framework. The system should
read student records from a file (students.txt) at the start of the application and
save updated records back to the file upon exit. The records should be managed
using collections like ArrayList or HashMap to store student information, and
should be sorted by marks using Comparator. The system should allow for
viewing, sorting, and displaying student data using Iterator. Additionally,
implement file attributes using the File class and demonstrate reading records
randomly using RandomAccessFile.
**Packages Used:**
- **model**
- **manager**
- **util**
- **main**

## Attributes
- **rollNo** -> Integer,unique student ID
- **name** -> String,name of the student
- **email** -> String,student's email address
- **course** -> String,course enrolled
- **marks** -> double,marks obtained

## System Components


#### Package:**model**
- **Student.java**
- Defines student attributes
- Provides getter for accessing fields
- Overrides **toString()** to print student details in a formatted manner

#### Package:**manager**
- **StudentManager.java**
Handles all core operations
- addStudent()
- viewStudent() using **Iterator**
- searchByName()
- deleteByName() using **removeIf**
- sortByMarks() suing **Comparator**
- Also uses **ArrayList<Student>** to maintain records

#### Package:**util**
**FileUtil.java**
- **BufferefReader** -> read from file
- **BufferedWriter** -> write to file

#### Package:**main**
- **Main.java**
- Menu-driven interface
- Takes user input through **Scanner**
- Loads student at startup of the program
- Saves modified data before exit the system
- Provides options for user operations

## Code Explanation


## Concepts Covered
- Packages
- Encapsulation
- ArrayList
- Comparator & sorting
- File Handling
- BufferedReader
- BufferedWriter
- Exception Handling
- Real-World experience

## Sample Output
<img width="504" height="279" alt="1" src="https://github.com/user-attachments/assets/b2bc262d-0c74-435e-bf77-7d1c77d9b086" />
<img width="756" height="363" alt="2" src="https://github.com/user-attachments/assets/28f7493a-72cf-4d2f-ba06-9e33739149b1" />
<img width="514" height="251" alt="3" src="https://github.com/user-attachments/assets/ff088c9b-1fdd-4d02-b6d4-7619e4abfd7c" />
<img width="512" height="357" alt="4" src="https://github.com/user-attachments/assets/244d7b13-16fd-4b58-881a-cb8e643f431a" />
<img width="581" height="207" alt="5" src="https://github.com/user-attachments/assets/f58352f0-49a0-4991-8bfc-a51f8138926a" />
<img width="901" height="542" alt="6" src="https://github.com/user-attachments/assets/7f72ae1b-e728-45ab-a15b-984d95a0792d" />

#### Java **main** link -> https://github.com/SidharthBScCS/Student-Record-Management-System-4/tree/main/main
#### Java **manager** link -> https://github.com/SidharthBScCS/Student-Record-Management-System-4/tree/main/manager
#### Java **model** link -> https://github.com/SidharthBScCS/Student-Record-Management-System-4/tree/main/model
#### Java **util** link -> https://github.com/SidharthBScCS/Student-Record-Management-System-4/tree/main/util

## Student Deatils
- **Name** -> Sidharth Krishna S
- **RollNo** -> 2401720003
- **Course** -> BSc Computer Science
- **Semester** -> 3rd Semester
- **Assignment** -> Java Lab Assignment 4
