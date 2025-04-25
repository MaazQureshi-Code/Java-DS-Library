public class Q6 {
    public static void main(String[] args) {


        double tuition = 10000;
        double annualIncreaseRate = 0.05; // 5% annual increase
        double totalCost = 0;

        for(int year = 1; year <= 10; year++){


            tuition += tuition * annualIncreaseRate;

        }
        System.out.printf("Tuition after 10 years: $%.2f%n", tuition);


        for (int year = 1; year <= 4; year++) {
            totalCost += tuition;
            tuition += tuition * annualIncreaseRate;
        }

        System.out.printf("Total cost for 4 years after the 10th year: $%.2f%n", totalCost);
        

    }
}
