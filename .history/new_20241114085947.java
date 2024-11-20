import java.util.Scanner;
import java.util.HashMap;

public class StudentList {
    public static void main(String[] args) {
        HashMap<String, String> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Collect 3 classmates' student numbers and names
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter student number " + i + ": ");
            String studentNumber = scanner.nextLine();
            System.out.print("Enter first name " + i + ": ");
            String firstName = scanner.nextLine();
            students.put(studentNumber, firstName);
        }

        // Display initial list
        System.out.println("Student List:");
        students.forEach((number, name) -> System.out.println(number + " " + name));

        // Remove the third entry and add user's info
        String thirdKey = (String) students.keySet().toArray()[2];
        students.remove(thirdKey);
        System.out.print("Enter your student number: ");
        students.put(scanner.nextLine(), scanner.nextLine());

        // Display updated list
        System.out.println("Updated Student List:");
        students.forEach((number, name) -> System.out.println(number + " " + name));

        scanner.close();
    }
}
