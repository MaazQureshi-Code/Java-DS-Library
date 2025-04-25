public class findmissingnumbers {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        
        
    }


    public static int findmissingnumber(int arr[]){

        int n = arr.length +1;
        int sum = n*(n+1)/2;

        for(int num: arr){
            sum = sum -num;
        }


        return  sum;

    }
}
