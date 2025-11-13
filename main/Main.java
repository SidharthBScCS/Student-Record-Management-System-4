package main;

import manager.StudentManager;
import model.Student;
import util.FileUtil;

import java.util.*;

public class Main {

    static final String FILE = "students.txt";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        ArrayList<Student> list = FileUtil.loadStudents(FILE);
        StudentManager manager = new StudentManager(list);

        System.out.println("Data loaded...");

        while (true) {

            System.out.println("Student Record Management System by 2401720003 Sidharth Krishna S");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search by Name");
            System.out.println("4. Delete by Name");
            System.out.println("5. Sort by Marks");
            System.out.println("6. Save and Exit");
            System.out.print("Enter choice: ");

            int choice = scan.nextInt();
            scan.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = scan.nextInt();
                    scan.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scan.nextLine();

                    System.out.print("Enter Course: ");
                    String course = scan.nextLine();

                    System.out.print("Enter Marks: ");
                    double marks = scan.nextDouble();

                    manager.addStudent(new Student(roll, name, email, course, marks));
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter name to search: ");
                    manager.searchByName(scan.nextLine());
                    break;

                case 4:
                    System.out.print("Enter name to delete: ");
                    manager.deleteByName(scan.nextLine());
                    break;

                case 5:
                    manager.sortByMarks();
                    manager.viewStudents();
                    break;

                case 6:
                    FileUtil.saveStudents(FILE, list);
                    System.out.println("Data saved successfully!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
