public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("===============================================");
        System.out.println("UC16 - Sort Passenger Bogies by Capacity (Bubble Sort)");
        System.out.println("===============================================");

        // Passenger bogie capacities
        int[] capacities = {72, 56, 24, 70, 60};

        // Display before sorting
        System.out.println("\nBefore Sorting:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        // 🔥 Bubble Sort
        int n = capacities.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (capacities[j] > capacities[j + 1]) {
                    // swap
                    int temp = capacities[j];
                    capacities[j] = capacities[j + 1];
                    capacities[j + 1] = temp;
                }
            }
        }

        // Display after sorting
        System.out.println("\n\nAfter Sorting:");
        for (int c : capacities) {
            System.out.print(c + " ");
        }

        System.out.println("\n\nUC16 sorting completed...");
    }
}