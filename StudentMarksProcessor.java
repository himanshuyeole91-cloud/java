import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Student {
    String name;
    int maths;
    int physics;
    int chemistry;

    Student(String name, int maths, int physics, int chemistry) {
        this.name = name;
        this.maths = maths;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    int getTotalMarks() {
        return maths + physics + chemistry;
    }
}

public class StudentMarksProcessor {
    public static void main(String[] args) {
        String filePath = "d:\\java practicals\\students.csv";
        List<Student> students = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            boolean isFirstLine = true;

            while ((line = reader.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                String[] parts = line.split(",");

                if (parts.length >= 8) {
                    String name = parts[1];
                    int maths = Integer.parseInt(parts[5]);
                    int physics = Integer.parseInt(parts[6]);
                    int chemistry = Integer.parseInt(parts[7]);

                    Student student = new Student(name, maths, physics, chemistry);
                    students.add(student);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Student Name | Total Marks");
        System.out.println("---------------------------");
        for (Student s : students) {
            System.out.println(s.name + " | " + s.getTotalMarks());
        }
    }
}
