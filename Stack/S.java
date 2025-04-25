
import java.util.EmptyStackException;
public class S {

    private Listnode top;
    private int length;


    private class Listnode{
        private int data;

        private Listnode next;

        public Listnode(int data){
            this.data = data;
        }
    }

    public S(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }
    public void  push(int data){
        Listnode temp = new Listnode(data);

        temp .next = temp;
        top = temp;
        length++;
    }

    public int pop(){
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;

    }

    public  int peek(){
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        return  top.data;
    }

    public static void main(String[] args){

        S stack = new S();

        stack.push(10);
        stack.push(1);
        stack.push(100);

        System.out.println(stack.peek());

    }
}
