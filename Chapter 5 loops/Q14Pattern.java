public class Q14Pattern {
    public static void main(String[] args) {
        for(int i = 6; i >= 0;i--){

            for(int j = 1; j <= i;j++){
                System.err.print(j + " ");
            }

            System.err.println("");
        }


        for(int i = 1; i <= 6;i++){

            for(int j = i; j >= 1;j--){
                System.err.print( j + " " );
            }

            System.err.println("");
        }

        System.out.println("");




        for(int i = 6; i >= 0;i--){
            int spaces = 6- i;
            // This part of the code is responsible for printing spaces before printing the numbers in
            // the pattern. The variable `spaces` is calculated as the difference between 6 and the
            // current value of `i`.
            for(int j = spaces; j>=1;j--){
                System.err.print("  ");
            }
            for(int j = 1; j <= i;j++){
                System.err.print(j + " ");
            }

            System.err.println("");
        }




    }
    }

