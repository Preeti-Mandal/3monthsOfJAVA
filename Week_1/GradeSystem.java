import java.util.ArrayList;
import java.util.LinkedList;

public class GradeSystem {
    private static final int TABLE_SIZE = 10; // Size of the hash table
    private static ArrayList<LinkedList<Pair>> table; // Array of linked lists for collision handling

    // Static block to initialize the table
    static {
        table = new ArrayList<>(TABLE_SIZE);
        for (int i = 0; i < TABLE_SIZE; i++) {
            table.add(new LinkedList<>());
        }
    }

    // Helper class to store key-value pairs
    static class Pair {
        int studentId;
        String grade;

        Pair(int studentId, String grade) {
            this.studentId = studentId;
            this.grade = grade;
        }
    }

    // Hash function
    public static int hashFunction(int studentId) {
        return studentId % TABLE_SIZE;
    }

    // Function to insert a grade
    public static void insertGrade(int studentId, String grade) {
        int index = hashFunction(studentId);
        table.get(index).add(new Pair(studentId, grade));
    }

    // Function to get a grade
    public static String getGrade(int studentId) {
        int index = hashFunction(studentId);
        for (Pair pair : table.get(index)) {
            if (pair.studentId == studentId) {
                return pair.grade;
            }
        }
        return null; // Grade not found
    }

    // Function to update a grade
    public static void updateGrade(int studentId, String newGrade) {
        int index = hashFunction(studentId);
        for (Pair pair : table.get(index)) {
            if (pair.studentId == studentId) {
                pair.grade = newGrade; // Update grade
                return;
            }
        }
        System.out.println("Student not found");
    }

    // Main method to demonstrate functionality
    public static void main(String[] args) {
        insertGrade(12345, "A");
        insertGrade(67890, "B");

        System.out.println(getGrade(12345)); // Output: A
        updateGrade(12345, "A+");
        System.out.println(getGrade(12345)); // Output: A+
    }
}
