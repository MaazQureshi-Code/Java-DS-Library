
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int[] arr = new int[10];

        int checkNum = 0;
        int counter = 0;

        System.out.print("Enter ten integers seperated by spaces: ");

        for (int i = 0; i < 10; i++) {
            checkNum = scanner.nextInt();
            if (specialNum(arr, checkNum)) {
                arr[counter] = checkNum;
                counter++;

            }
        }
        
            System.out.println("The count of distinct numbers are " + counter);
        System.out.print("The distinct numbers are");

        


    }
    
    public static boolean specialNum(int[] a, int number) {
        
        for (int i = 0; i < a.length; i++) {

            if (a[i] == number) {
                return false;
            }

        }
        
        return true;
    }
}