package util;

import model.Student;
import java.io.*;
import java.util.*;

public class FileUtil {

    public static ArrayList<Student> loadStudents(String fileName) {
        ArrayList<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {

                // Split using comma ONLY (best practice)
                String[] s = line.split(",");

                int rollNo = Integer.parseInt(s[0].trim());
                String name = s[1].trim();
                String email = s[2].trim();
                String course = s[3].trim();
                double marks = Double.parseDouble(s[4].trim());

                students.add(new Student(rollNo, name, email, course, marks));
            }

        } catch (IOException e) {
            System.out.println("File is missing. Starting with empty list.");
        }

        return students;
    }


    public static void saveStudents(String fileName, ArrayList<Student> list) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

            for (Student s : list) {
                String line = s.getRollNo() + "," 
                            + s.getName() + ","
                            + s.getEmail() + ","
                            + s.getCourse() + ","
                            + s.getMarks();

                bw.write(line);
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
