
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phone number: ");
        String phoneNumber = scanner.nextLine();
        StringBuilder translatedNumber = new StringBuilder();
        for (char ch : phoneNumber.toCharArray()) {
            if (Character.isLetter(ch)) {
                translatedNumber.append(getNumber(ch));
            } else {
                translatedNumber.append(ch);
            }
        }
        System.out.println("The translated phone number is: " + translatedNumber.toString());    
        
    }
    

    int getNumber(Char upperCaseLetter){

        String letter = String.valueOf(upperCaseLetter).toLowerCase();

        if("abc".contains(letter)){
            return 1;
        }else if ("def".contains(letter)) {
            return 2;

        } else if ("ghi".contains(letter)) {
            return 3;

        } else if ("jkl".contains(letter)) {
            return 4;

        } else if ("mno".contains(letter)) {
            return 5;

        } else if ("pqr".contains(letter)) {
            return 6;

        } else if ("stu".contains(letter)) {
            return 7;

        } else if ("vwx".contains(letter)) {
            return 8;

        } else if ("yz".contains(letter)) {
            return 9;

        }
        return -1;

    }

    public static int getNumber(char uppercaseLetter) {

        uppercaseLetter = Character.toUpperCase(uppercaseLetter);
        if (uppercaseLetter >= 'A' && uppercaseLetter <= 'C') {
            return 2;
        } else if (uppercaseLetter >= 'D' && uppercaseLetter <= 'F') {
            return 3;
        } else if (uppercaseLetter >= 'G' && uppercaseLetter <= 'I') {
            return 4;
        } else if (uppercaseLetter >= 'J' && uppercaseLetter <= 'L') {
            return 5;
        } else if (uppercaseLetter >= 'M' && uppercaseLetter <= 'O') {
            return 6;
        } else if (uppercaseLetter >= 'P' && uppercaseLetter <= 'S') {
            return 7;
        } else if (uppercaseLetter >= 'T' && uppercaseLetter <= 'V') {
            return 8;
        } else if (uppercaseLetter >= 'W' && uppercaseLetter <= 'Z') {
            return 9;
        }

        // Return -1 if the character is not a valid letter
        return -1;
    }

}
