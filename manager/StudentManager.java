package manager;

import model.Student;
import java.util.*;

public class StudentManager {

    private ArrayList<Student> studentList;

    public StudentManager(ArrayList<Student> list) {
        this.studentList = list;
    }

    public void addStudent(Student s) {
        studentList.add(s);   
        System.out.println("Student added successfully");
    }

    public void viewStudents() {
        Iterator<Student> itr = studentList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public void searchByName(String name) {
        for (Student s : studentList) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println(s);
                return;
            }
        }
        System.out.println("No such student found");
    }

    public void deleteByName(String name) {
        boolean removed = studentList.removeIf(s -> s.getName().equalsIgnoreCase(name));
        if (removed) {
            System.out.println("Student deleted");
        } else {
            System.out.println("Student not found");
        }
    }

    public void sortByMarks() {
        studentList.sort(Comparator.comparingDouble(Student::getMarks).reversed());
        System.out.println("Students sorted by marks");
    }
}
