public class Binery_search {
    

    public  int binarySearch(int [] num,int key){
        int low = 0;
        int high = num.length - 1;

        while(low <= high){

            int mid = (high + low)/2;

            if(num[mid] == key){
                return mid;
            }

            if(key < num[mid]){
                high  = mid -1;
            }else{
                low = mid +1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        
    }
}
