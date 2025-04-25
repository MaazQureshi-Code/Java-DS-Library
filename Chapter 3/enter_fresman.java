import java.util.Scanner;

public class enter_fresman {
    public static void main(String[] args) {
       System.out.println("Please enter two characters Ex.(C3), M, C, or I for your major \nand "
                + "1 thru 4, for your status. (1 being"
                + "\nfreshman and 4 being senior)");

        Scanner input = new Scanner(System.in);
        String statusCode = input.nextLine();

        char major = statusCode.charAt(0);
        char statusYear = statusCode.charAt(1);

        String s1 = "";
        String s2 = "";

        switch (major) {
            case 'M' -> s1 = "Mathematics";
            case 'C' -> s1 = "Computer Science";
            case 'I' -> s1 = "Information Technology";
            default -> {
            }
        }

        switch (statusYear) {
            case '1' -> s2 = "Freshman";
            case '2' -> s2 = "Sophomore";
            case '3' -> s2 = "Junior";
            case '4' -> s2 = "Senior";
            default -> {
            }
        }

        System.out.println(s1 + " " + s2);






    }
}
