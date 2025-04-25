import java.util.Scanner;;
public class calculate_tips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double subTotal,rate;
        System.out.println("Enter the subtotal and a gratuity rate:");
        subTotal = scanner.nextDouble();
        rate = scanner.nextDouble();

        double gratuity = (rate/100) * subTotal;
        double total = gratuity+subTotal;
        System.out.println("The gravity is   "+ gratuity+ " and the total is  " + total);
        scanner.close();

    }
}
