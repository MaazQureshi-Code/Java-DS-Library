
import java.util.Scanner;

public class Q4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num = new int[100];

        int temp;
        int count = 0;
         int sum = 0;
        do {

            temp = scanner.nextInt();
            sum += temp;
            if (temp > 100) {
                System.err.println("Wrong number");
                break;
            }
            num[count] = temp;

            count++;
            
        } while (temp >= 0);
       
        double avg = (double) sum / count;
           int equal = 0, below = 0, above = 0;
       
           for (int i = 0; i < count; i++) {

               if (num[i] == avg) {
                   equal++;
               } else if (num[i] < avg) {
                   below++;
               } else {
                   above++;
               }
           }
        
             System.out.println("Average: " + avg);
        System.out.println("Equal to avg: " + equal);
        System.out.println("Below avg: " + below);
        System.out.println("Above avg: " + above);



        
    }
}
