
import java.util.Scanner;

public class Sort_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int max = 0;
        int min = 0;

      if(num1 > num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
      }
      if(num2 > num3){
        int temp = num2;
        num2 = num3;
        num3 = temp;
      }

      if(num1 > num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
      }
      System.out.println(num1 + " " + " " + num2 + " " + num3);

    }
}
