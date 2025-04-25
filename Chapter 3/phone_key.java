import java.util.Scanner;

public class phone_key {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
       

        System.err.println("Enter a letter: ");
        // This is for charachers
    char  keys =  scanner.nextLine().charAt(0);
    ///c see the fuck it up

    if (keys == 'A' || keys == 'A' ||keys == 'b' || keys == 'B' ||keys == 'C' ||keys == 'c'){

        num = 2;


    }else if (keys == 'd' || keys == 'D' ||keys == 'E' || keys == 'e' ||keys == 'f' ||keys == 'F') {

        num = 3;
        
    }else if (keys == 'g' || keys == 'G' ||keys == 'h' || keys == 'H' ||keys == 'i' ||keys == 'I') {


        num = 4;
        
    }else if (keys == 'j' || keys == 'J' ||keys == 'K' || keys == 'k' ||keys == 'l' ||keys == 'L') {

        num = 5;
        
    }else if (keys == 'm' || keys == 'M' ||keys == 'N' || keys == 'n' ||keys == 'o' ||keys == 'O') {

        num = 6;
        
    }else if (keys == 'p' || keys == 'P' ||keys == 'Q' || keys == 'q' ||keys == 'R' ||keys == 'r' || keys == 's' || keys == 'S' ) {

        num = 7;
        
    }else if (keys == 't' || keys == 'T' ||keys == 'u' || keys == 'U' ||keys == 'V' ||keys == 'V' ) {

        num = 8;
        
    }else if (keys == 'w' || keys == 'W' ||keys == 'x' || keys == 'X' ||keys == 'Y' ||keys == 'y' ||keys == 'z' || keys == 'Z' ) {

        num = 9;
        
    }else{
        System.err.println("Invalid number");
    }


    }
}
