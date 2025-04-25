
import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int max = 0;




     
        while (true) {
           

            int num = scanner.nextInt();
            if (num == 0) {
                break;  // End the loop if the input is 0
            }
          
            if(num > max){
                max = num;
                count = 1;
            }else if(num == max) {

                count++;
            }
            

            
        }

        System.out.println("The largest number is " + max);
        System.out.println("The occurrence count of the largest number is " + count);
        

    }
}
