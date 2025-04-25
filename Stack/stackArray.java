
public class stackArray {

    public static void main(String[] args) {
        
    }
    
}

class Stack{
    public  int top ;
    public  int[] arr;
    public Stack (int capacity){
        top = -1;

        arr = new int[capacity];
    }


   public int pop(){
    if(isEmpty()){
        throw new  RuntimeException("Stack is empty !!!");
    }

    int result = arr[top];

    top--;
    return result;
   }
   public boolean isEmpty(){
    return  top < 0;
   }

    public void push(int data){
        if(isFull()){
            throw new RuntimeException("Stack is full !!");
        }

        top++;
        arr[top] = data;
    }

    public  boolean isFull(){
        return arr.length == size();
    }

    public int size(){
        return top +1;
    }


}