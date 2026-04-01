import java.util.LinkedHashSet;

public class TrainConsistManagementApp  {

    public static void main(String[] args) {

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Attempt to add duplicate
        train.add("Sleeper");  // This will be ignored automatically

        // Display output
        System.out.println("UC5 - Preserve Insertion Order of Bogies");
        System.out.println("=========================================");

        System.out.println("\nFinal Train Formation:");
        System.out.println(train);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed...");
    }
}