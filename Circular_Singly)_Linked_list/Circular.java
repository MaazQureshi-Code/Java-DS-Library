
import java.util.NoSuchElementException;


public class Circular {

    private listNode last;
    private int length;

    private  class listNode{
        private listNode next;

        private int data;


        public listNode(int data){
            this.data = data;

        }
    }

    public  Circular(){
        last = null;
        length = 0;
    }

    public  int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }


    public void createCircularLinkedList(){

        /// the is how we create Circular linked list
        listNode first = new listNode(1);
        listNode second = new listNode(2);
        listNode thired = new listNode(1);
        listNode fourth = new listNode(1);
        first.next = second;
        second.next = thired;
        thired.next = fourth;
        fourth.next = first;

        last = fourth;


        
    }
    public void  display(){
        if( last == null){
            return;
        }
        listNode first = last.next;
        while (first != last) {
            System.out.print(first.data+" ");
            first = first.next;
            
        }

        System.err.print(first.data);
    }


    public void insertFirst(int data){
        listNode temp = new listNode(data);


        if(last == null){

            last = temp;
        }else{
            temp.next = last.next;
        }
        last.next = temp;
        length++;

    }

    public void insertLast(int data){
        listNode temp = new listNode(data);
        if(last == null){
            last = temp;
            last.next = last;
        }else{
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public  listNode removeFirst(){
        if(isEmpty()){
            throw new  NoSuchElementException("Circular singly Lisnked lsit is already empty");

        }

        listNode temp = last.next;
        if(last.next == last){
            last = null;
        }else{
            last.next = temp.next;
        }

        temp.next = null;

        length--;
        return  temp;
    }

    public static void main(String[] args) {        
        Circular  csll = new Circular();
        csll.createCircularLinkedList();
        csll.insertFirst(55);
        csll.display();

    }
    
}
