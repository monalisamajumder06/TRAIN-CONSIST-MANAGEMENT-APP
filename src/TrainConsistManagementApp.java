import java.util.*;

// Goods Bogie class
class GoodsBogie {
    String type;
    String cargo;

    GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // Create goods bogies list
        List<GoodsBogie> bogies = new ArrayList<>();
        bogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        bogies.add(new GoodsBogie("Open", "Coal"));
        bogies.add(new GoodsBogie("Box", "Grain"));
        bogies.add(new GoodsBogie("Cylindrical", "Coal")); // ❌ invalid

        System.out.println("===============================================");
        System.out.println("UC12 - Safety Compliance Check for Goods Bogies");
        System.out.println("===============================================");

        // Display bogies
        System.out.println("\nGoods Bogies in Train:");
        for (GoodsBogie b : bogies) {
            System.out.println(b.type + " -> " + b.cargo);
        }

        // 🔥 Safety validation using allMatch()
        boolean isSafe = bogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum")
                );

        // Output result
        System.out.println("\nSafety Compliance Status: " + isSafe);

        if (!isSafe) {
            System.out.println("Train formation is NOT SAFE.");
        } else {
            System.out.println("Train formation is SAFE.");
        }

        System.out.println("\nUC12 safety validation completed...");
    }
}