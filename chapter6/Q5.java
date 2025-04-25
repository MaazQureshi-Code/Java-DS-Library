
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new  Scanner(System.in);
        System.out.println("Enter investment amount:");

        double investmentAmount = scanner.nextDouble();

        System.out.println("Enter annual interest rate (in percentahe): ");

        double annialInterestRate = scanner.nextDouble();

        // convert annual interest rate to monthly interest rate

        double monthlyInterestRate = annialInterestRate/1200;

        System.out.println("\nYear\tFuture Value");

        // Loop through years 1 to 30 and calculate future value
        for (int year = 1; year <= 30; year++) {
            double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, year);
            System.out.printf("%d\t%.2f\n", year, futureValue);
        }


        
    }
    public  static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years){
     
        return investmentAmount * Math.pow(1 + monthlyInterestRate, years * 12);
    }
}
