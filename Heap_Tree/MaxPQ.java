

public class MaxPQ {

 private  Integer[] heap;
    private  int n;

    public MaxPQ(int capacity){
        heap = new Integer[capacity + 1];
        n = 0;
    }

    public boolean inEmpty(){
        return n == 0;
    }

    public int size(){
        return  n;
    }

    public  void  inert(int x ){
        if( n == heap.length - 2){

            resize(2* heap.length);

        }
        n++;
        heap[n] = n;
        swim(n);
    }

    private  void swim(int k ){
        while(k > 1 && heap[k/2] < heap[k]){
        int temp = heap[k];
        heap[k] = heap[k/2];
        heap[k/2] = temp;
    }
}

    private void resize(int capacity){
        Integer[] temp  = new Integer[capacity];
        for(int i = 0 ; i < heap.length;i++){
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public static void main(String[] args) {
        MaxPQ pq = new MaxPQ(3);
        System.err.println(pq.size());
        
    }
}
