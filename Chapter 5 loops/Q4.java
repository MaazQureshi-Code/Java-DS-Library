

public class Q4 {
    public static void main(String[] args) {
        
        System.out.printf("%-12s %-8s | %-8s %-12s%n", "Kilograms", "Pounds", "Pounds", "Kilograms");

        int poundsStart = 20; // Starting point for pounds

        // Loop for both tables
        for (int kg = 1, pounds = poundsStart; kg <= 199; kg += 2, pounds += 5) {
            double kgtoPounds = kg * 2.2;    // Convert kilograms to pounds
            double poundsTokg = pounds / 2.2; // Convert pounds to kilograms

            // Print the formatted output correctly
            System.out.printf("%-12d %-8.1f | %-8d %-12.2f%n", kg, kgtoPounds, pounds, poundsTokg);
        
        }
    }
}
