import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // 1. Add students
        students.add(new Student("S01", "Alice", 8.5));
        students.add(new Student("S02", "Bob", 7.2));
        students.add(new Student("S03", "Charlie", 9.0));

        // 2. Display all students
        System.out.println("=== Student List ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // 3. Search by ID
        String searchId = "S02";
        System.out.println("\n=== Search Student by ID: " + searchId + " ===");
        for (Student s : students) {
            if (s.getId().equals(searchId)) {
                System.out.println("Found: " + s);
            }
        }

        // 4. Remove student
        students.removeIf(s -> s.getId().equals("S01"));
        System.out.println("\n=== After Removing S01 ===");
        for (Student s : students) {
            System.out.println(s);
        }

        // 5. Sort by grade descending
        Collections.sort(students, Comparator.comparingDouble(Student::getGrade).reversed());
        System.out.println("\n=== Sorted by Grade Descending ===");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
