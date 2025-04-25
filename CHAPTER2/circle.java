
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the point x,y");

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double x1 = 0;
        double y1 = 0;


        String res = "";
        double distanceToZero = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if(distanceToZero <= 10){
            res += "is in the circle: ";

        }else{
            res += "is not in the circle:";
        }

        System.out.println("Point ("+ x2 +","+y2+") "+ res);
        scanner.close();






    }
}
