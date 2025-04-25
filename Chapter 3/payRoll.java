
import java.util.Scanner;

public class payRoll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int numHours;
        int pay_rate;
        double federal;
        double state_tax;

        System.err.println("Enter employee name:");
        name = scanner.nextLine();
        System.out.println("Enter number of hours: worked in a week:");
        numHours = scanner.nextInt();
        System.err.println("Enter hourly pay rate:");
        pay_rate = scanner.nextInt();
        System.err.println("Enter federal tax withholding rate:");
        federal = scanner.nextDouble();
        System.err.println("Enter state tax withholding rate:");
        state_tax = scanner.nextDouble();
        double total_pay = numHours*pay_rate;
        double federal_deduction = total_pay*0.20;
        double state_deduction = state_tax*total_pay;
        double final_pay = federal_deduction+state_deduction;
        double finals = total_pay-final_pay;
        System.err.println("Employee Name:"+name);
        System.out.println("Hours Worked:"+numHours);
        System.out.println("Pay Rate:"+pay_rate);
        System.out.println("Gross Pay"+total_pay);
        System.err.println("Deductions:");
        System.err.println("   Federal withholding (20.0%):"+federal_deduction);
        System.out.println("   State Withholding (9.0 %):  "+state_deduction);
        System.out.println("    Total Deduction:"+final_pay);
        System.out.println("Net Pay:"+finals);


    }

}
