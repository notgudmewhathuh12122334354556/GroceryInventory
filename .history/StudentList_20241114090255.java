import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Map<String, String> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter student number " + i + ": ");
            String studentNumber = scanner.nextLine();
            System.out.print("Enter first name " + i + ": ");
            String firstName = scanner.nextLine();
            students.put(studentNumber, firstName);
        }

        System.out.println("Student List:");
        students.forEach((key, value) -> System.out.println(key + " " + value));

        String thirdKey = (String) students.keySet().toArray()[2];
        students.remove(thirdKey);

        System.out.print("Enter your student number: ");
        String myStudentNumber = scanner.nextLine();
        System.out.print("Enter your first name: ");
        String myFirstName = scanner.nextLine();
        students.put(myStudentNumber, myFirstName);

        System.out.println("Updated Student List:");
        students.forEach((key, value) -> System.out.println(key + " " + value));

        scanner.close();
    }
}
