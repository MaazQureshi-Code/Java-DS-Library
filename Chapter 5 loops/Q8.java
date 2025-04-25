
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallest = 0;

        int n = 1;


        while (n*n > 1200) {
            smallest = n;
            n++;

            if (n < smallest ){
                smallest = n;
            }       
        }

        System.err.println(" the smallest is " + n);
    }
}
