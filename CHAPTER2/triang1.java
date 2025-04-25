
import java.util.Scanner;

public class triang1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();


        if(c>(a+b) || b > (a+c) || a > (b+c) || a > (c+b)){
            System.err.println("invalid");
        }else{
            System.err.println("Parameter");
        }
        scanner.close();
        
    }
}
