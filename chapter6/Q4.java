public class Q4 {
    public static void main(String[] args) {
        displayPattern(10);




        
    }

    public static void displayPattern(int n){


        for(int i = 1; i <= n;i++){

            for (int space = 0; space < n - i; space++) {
                System.out.print("  ");
            }

            for(int j =i ; j >0;j--){
                System.err.print(" " + j);



            }
            System.err.println("");

        }

    }




}
