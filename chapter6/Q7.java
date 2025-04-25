public class Q7 {
    public static void main(String[] args) {

        System.out.println("The result is is following " + password_cheeing("Maazssss"));
        

        
    } 



    public static String password_cheeing(String value){
        String x;
        int digit_Count = 0;
        // We use For each method here it was very usefull I Like it 
        for (char elem : value.toCharArray()) {
            if(Character.isDigit(elem)){
                digit_Count++;
            }
        }


        if (value.length() < 8) {
            return "It should be at least 8 characters";
        }
    
        // Check number of digits
        if (digit_Count < 2) {
            return "The password should have at least 2 digits";
        }

        // If all conditions are met
        return "Password is valid";
    }
}
