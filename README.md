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
Packages Used:
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
The Student Record Management System is designed using the principles of 
Object-Oriented Programming, modular development, and file-based data storage. 
The system is divided into multiple packages, each responsible for a specific layer 
of functionality. This package-based design improves clarity, maintainability, and 
reusability throughout the application.

The model package contains the blueprint of the student entity. This class 
encapsulates all data related to a student, such as roll number, name, email, 
course, and marks. By keeping the data private and exposing only getter methods, 
the system ensures proper encapsulation, which prevents accidental modification 
and protects data integrity.

The manager package contains the logic used to handle all operations performed on 
the student records. This includes adding new records, viewing existing records, 
searching for a specific student, deleting a record, and sorting students by marks. 
These operations involve basic data processing and manipulation, which are 
performed on a dynamic list structure. The manager acts as the “brain” of the 
system and connects user actions to the underlying data.

The util package handles all file-related operations. Since the system uses 
file storage instead of a database, it requires text file handling to store and 
retrieve data. The reading and writing of files ensure that student records are 
preserved even after the program is closed. Features such as viewing file 
attributes and demonstrating random access further strengthen the file-handling 
component by showing additional capabilities of the Java IO system.

The main package contains the menu-driven user interface, which allows the user 
to interact with the system. The main class continuously displays a menu, accepts 
user input, and performs the corresponding operation. This structured interaction 
ensures simplicity and familiarity for the user, while the program internally 
manages all the required file operations and data handling.

Throughout the system, exception handling is applied to ensure that invalid 
inputs, missing files, or unexpected errors do not cause the program to crash. 
Instead, errors are caught, handled gracefully, and communicated to the user. 
The use of try–catch blocks allows the system to continue functioning smoothly 
even when problems occur.

The system also incorporates collections, iterators, and sorting mechanisms, 
which demonstrate how large sets of data can be managed efficiently. The use 
of modern programming concepts such as lambda expressions for filtering and 
comparator-based sorting simplifies the logic and enhances readability.

Overall, this project demonstrates how multiple Java concepts can be integrated 
to build a functional, modular, and reliable application. 
It showcases practical use of packages, file handling, collections, 
and exception handling in a real-world context, making the program scalable, 
user-friendly, and well-structured for academic evaluation.

Package:**model**
**Student.java**
- Defines student attributes
- Provides getter for accessing fields
- Overrides **toString()** to print student details in a formatted manner

Package:**manager**
**StudentManager.java**
Handles all core operations
- addStudent()
- viewStudent() using **Iterator**
- searchByName()
- deleteByName() using **removeIf**
- sortByMarks() suing **Comparator**
- Also uses **ArrayList<Student>** to maintain records

Package:**util**
**FileUtil.java**
- **BufferefReader** -> read from file
- **BufferedWriter** -> write to file

Package:**main**
**Main.java**
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

## Java **main** link -> https://github.com/SidharthBScCS/Student-Record-Management-System-4/tree/main/main
## Java **manager** link -> https://github.com/SidharthBScCS/Student-Record-Management-System-4/tree/main/manager
## Java **model** link -> https://github.com/SidharthBScCS/Student-Record-Management-System-4/tree/main/model
## Java **util** link -> https://github.com/SidharthBScCS/Student-Record-Management-System-4/tree/main/util

## Student Deatils
- **Name** -> Sidharth Krishna S
- **RollNo** -> 2401720003
- **Course** -> BSc Computer Science
- **Semester** -> 3rd Semester
- **Assignment** -> Java Lab Assignment 4







































































