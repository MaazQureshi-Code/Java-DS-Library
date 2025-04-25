





public class matrix_Search {

    public  void search(int [][] matrix,int n , int x){
        int i = 0;
        int j = n -1;

        while (i < n && j >= 0) {

            if(matrix[i][j] == x){
                System.err.println(" x found at - " + i + " , " + j);
            }

            if(matrix[i][j] > x){
                j--;
            }else{
                i++;
            }
            
        }

        System.err.println("Value not found");
    }
    public static void main(String[] args) {
        int [][] matrix = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,51}
        };


        matrix_Search sr = new matrix_Search();
        sr.search(matrix, 4, 32);
        

        
    }
}
