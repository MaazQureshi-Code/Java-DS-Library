
import java.util.Scanner;



public class Q17 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // Prompt user for loan amount and loan period
        System.out.print("Enter loan amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Enter loan period (in years): ");
        int loanPeriod = input.nextInt();

        // Display header
        System.out.printf("%-15s%-20s%-20s\n", "Interest Rate", "Monthly Payment", "Total Payment");

        // Loop through interest rates from 5% to 8% with an increment of 1/8
        for (double annualRate = 5.0; annualRate <= 8.0; annualRate += 0.125) {
            double monthlyRate = annualRate / 1200; // Convert annual rate to monthly rate
            int numberOfPayments = loanPeriod * 12;

            // Calculate monthly payment using formula
            double monthlyPayment = loanAmount * monthlyRate / 
                                    (1 - 1 / Math.pow(1 + monthlyRate, numberOfPayments));
            double totalPayment = monthlyPayment * numberOfPayments;

            // Display results
            System.out.printf("%-15.3f%-20.2f%-20.2f\n", annualRate, monthlyPayment, totalPayment);
        }

        input.close();

    }
    
}
