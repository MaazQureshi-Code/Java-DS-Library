public class liner_search {


    public int search(int []arr,int n , int x){

        for(int i =0; i<n;i++){
            if(arr[i] == x){
                return i;
            };
        }
        return -1;
    }
    public static void main(String[] args) {

        int [] arr = {5,1,9,2,10,15,20};
        liner_search is = new liner_search();

        is.search(arr, arr.length, 10);
        
    }
}
