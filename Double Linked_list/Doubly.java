
import java.util.NoSuchElementException;



public class Doubly {

    public ListNode head;

    public  ListNode tail;

    public int length;

    public class ListNode{
        public int data;

        public ListNode next;
        public ListNode previous;


        public ListNode (int data){
            this.data = data;
        }

    }
    public  Doubly(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0; // head = null
    }
    public int length(){
        return  length;
    }


    public void displayForward(){
        if(head == null){
            return;
        }

        ListNode temp = head;

        while(temp != null){
            System.out.print(temp.data + " -->");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public  void  displayBackward(){
        if(tail == null){
            return;

        }
        ListNode temp = tail;

        while(temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }

        System.out.println("null");

        
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            tail = newNode;
        }else{
            head.previous = newNode;

        }
        newNode.next = head;
        head = newNode;
        length++;

    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);

        if(isEmpty()){
            head = newNode;
        }else{
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;


    }

    public  ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }

        ListNode temp = head;
        if(head == tail){
            tail = null;
        }else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }
    public  ListNode deleteLastt(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head == tail){
            tail = null;
        }else{
            tail.previous.next = null;
        }
        tail = tail.next;
        temp.previous = null;

        length--;
        return temp;
    }





    public static void main(String[] args) {
        Doubly dll = new  Doubly();
        dll.insertFirst(1);
        dll.insertFirst(5);

        dll.displayBackward();
        dll.displayForward();


        
    }

    
}
