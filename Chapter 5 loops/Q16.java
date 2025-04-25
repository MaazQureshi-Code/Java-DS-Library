public class Q16 {
    public static void main(String[] args) {
        



        for(int i =0; i<8;i++){
            int lines = 8 ;

            for(int j = 1;j <lines  - i ;j++){
                System.err.print("   ");
            }

            for(int j = 0; j <= i; j++ ){
                double result = Math.pow(2, j);
                System.err.print((int)Math.pow(2, j) + "   ");
            }
            for(int j =  i -1 ; j >= 0; j-- ){
                double result = Math.pow(2, j);
                System.err.print((int)Math.pow(2, j) + "   ");
            }

            


            System.err.println();



        }
    }
}
