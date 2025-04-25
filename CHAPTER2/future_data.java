
import java.util.Scanner;

public class future_data {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the day:");
        int day = scanner.nextInt();
        System.out.println("Enter the number of days elapsed since today: ");
        int future = scanner.nextInt();

        int future1 = (day + future) % 7;
        
        String current_date ;
        if (day == 0) {
            current_date = "Sunday";
            
        }else if(day == 1){
            current_date = "Monday";
        }else if(day == 2){
            current_date = "Theuday";
        }else if(day == 3){
            current_date = "Wednesday";
        }else if(day == 4){
            current_date = "Thurday";
        }else{
            current_date = "Friday";
        }
        String futureDayName;
        if ( future1== 0) {
            futureDayName = "Sunday";
            
        }else if(future1 == 1){
            futureDayName = "Mooday";
        }else if(future1 == 2){
            futureDayName = "Theuday";
        }else if(future1 == 3){
            futureDayName = "Wednesday";
        }else if(future1 == 4){
            futureDayName = "Thurday";
        }else{
            futureDayName = "Friday";
        }
        System.out.println("Today is " + current_date + " future is " + futureDayName);
        
    }
}
