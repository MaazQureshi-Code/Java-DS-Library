import java.util.Scanner;

public class Sum_of_digit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;
        System.out.println("Enter a number between 0 and 1000:");
        num = scanner.nextInt();
        System.out.println(Sums(num));

        scanner.close();
    }

    public static int  Sums(int a){

        int sum = 0;
        while (a > 0) {

            sum += (a % 10);

            a /= 10;
        }


        return sum;
    }
}
