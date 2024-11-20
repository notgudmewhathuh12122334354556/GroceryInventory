import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 1. Create an empty hash map named programs
        HashMap<String, String> programs = new HashMap<>();

        // 2. Map the specified pairs
        programs.put("BSIT", "Bachelor of Science in Information Technology");
        programs.put("BSCS", "Bachelor of Science in Computer Science");
        programs.put("BSIS", "Bachelor of Science in Information Systems");

        // 3. Display the keys in a single line
        System.out.println("Keys: " + String.join(", ", programs.keySet()));

        // 4. Delete the first entry (BSIT in this case)
        programs.remove("BSIT");

        // 5. Check whether the map contains the key "BSCpE"
        boolean containsBSCpE = programs.containsKey("BSCpE");
        System.out.println("Contains BSCpE: " + containsBSCpE);
    }
}
