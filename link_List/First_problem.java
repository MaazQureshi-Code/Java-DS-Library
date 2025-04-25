
import java.util.Scanner;


public class First_problem {

    private ListNode head;
    private static class ListNode{
        private int data;
        private ListNode next;


        public ListNode (int data){
            this.data = data;
            this.next = null;
            
        }    
    }


        public int length(){
            if(head == null){
                return 0;
            }
            int count = 0;

            ListNode current = head;

            while(current != null){
                count++;
                current = current.next;
            }

            return  count;
        }

        public void display(ListNode head){
            ListNode current = head;
            while(current != null){
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.err.println("Null");

        }


        public void display(){
            ListNode current = head;
            while(current != null){
                System.out.print(current.data + " --> ");
                current = current.next;
            }
            System.err.println("Null");

        }

        public void inssertFirst(int value){
            ListNode newNode = new ListNode(value);
            newNode.next = head;
            head = newNode;

        }

        public void insertlost(int value){
            ListNode newNode = new ListNode(value);

            if(head == null){
                head = newNode;
                return;
            }
            ListNode currect = head;
            while(null != currect.next){
                currect = currect.next;
            }

            currect.next = newNode;


        }

        public void insert_specific_position(int position , int value){
            // 1 -> 4 -> 5
            ListNode node = new ListNode(value);
            if(position == 1){
                node.next = head;
                head = node;

            }else{

                ListNode previous = head;

                int count = 1;

                while (count < position -1 ) { 
                    previous = previous.next;
                    count++;
                }
                ListNode current = previous.next;
                previous.next = node;
                node.next = current;

            }
            

        }
        public  ListNode deleteFirst(){
            if(head == null){
                return null;
            }

            ListNode temp = head;

            head = head.next;

            temp.next = null;

            return  temp;

        }
        public ListNode deletelast(){
            if(head == null || head.next == null){
                return head;
            }


            
            ListNode current = head;
            ListNode previous = null;
            while(current.next != null){
                previous = current;
                current = current.next;
            }
            previous.next = null;
            return current;


    
        }

        public void delete_Given_position(int position){
            if(position == 1){
                head = head.next;
            }else{
                ListNode previous = head;
                int count = 1;

                while(count < position - 1){
                    previous = previous.next;
                    count++;
                }
                ListNode current = previous.next;
                previous.next = current.next;

            }


        }
        public boolean find(ListNode head,int searchKey){
            if(head == null){
                return  false;
            }

            ListNode current = head;

            while(current != null){
                if(current.data == searchKey){
                    return true;
                }

                current = current.next;

            }

            return false;


        }


        public ListNode reverse(ListNode head){
            if(head == null){
                return head;
            }

            ListNode curremt = head;
            ListNode previous = null;
            ListNode next = null;
            while(curremt != null){
                next = curremt.next;
                curremt.next = previous;
                previous = curremt;
                curremt = next;
            }

            return  previous;

        }


        public ListNode getNthNodeFromEnd(int n){
            if(head == null){
                return  null;
            }

            if(n <= 0){
                throw new IllegalArgumentException("Invalid value: n " + n);
            }

            ListNode mainPtr = head;
            ListNode refPtr = head;

            int count = 0;

            while (count < n) {
                if(refPtr == null){
                    throw new IllegalArgumentException(n + "is greater than the  number of nodes in list");
            }
                
                refPtr = refPtr.next;
                count++;
                
            }

            while(refPtr != null ){
                refPtr = refPtr.next;
                mainPtr = mainPtr.next;
            }

            return mainPtr;

        }


        public void removeDuplicates(){
            if(head == null){
                return;
            }

           ListNode current = head;

            while(current != null && current.next != null){
                if(current.data == current.next.data){

                    current.next = current.next.next;
                }else{
                    current = current.next;
                }

            }

        }
        public  ListNode insertinSortedList(int value){
            ListNode newNode = new ListNode(value);

            if(head == null){
                return newNode;
            }

            ListNode current = head;
            ListNode temp = null;

            while(current != null && current.data < newNode.data){
                temp = current;
                current = current.next;

            }

            newNode.next = current;
            temp.next = newNode;
            return head;
        }

        public void deleteNode(int key){
            ListNode current = head;
            ListNode temp = null;

            if(current != null && current.data == key){
                head = current.next;
                return;
            }

            while(current != null && current.data != key){
                temp = current;
                current = current.next;
            }

            if(current == null){
                return;
            }

            temp.next = current.next;
            
        }

        public ListNode startNodeInAloop(){
            ListNode fastPtr = head;
            ListNode slowPtr = head;


            while(fastPtr != null && fastPtr.next != null){
                fastPtr = fastPtr.next.next;

                slowPtr = slowPtr.next;

                if(slowPtr == fastPtr){
                    return  getStartingNode(slowPtr);
                }
            }
            return null;
        }

        public ListNode  getStartingNode(ListNode slowptr){
            ListNode temp = head;

            while(temp != slowptr){
                temp = temp.next;
                slowptr = slowptr.next;
            }

            return temp;

        }
        // this is the one that detect 
        public boolean containsLoop(){
            ListNode fastPtr = head;
            ListNode slowPtr = head;


            while(fastPtr != null && fastPtr.next != null){
                fastPtr = fastPtr.next.next;

                slowPtr = slowPtr.next;

                if(slowPtr == fastPtr){
                    return  true;
                }
            }
            return false;
        }



        public  void createLoopInLinkedList(){
            ListNode first = new ListNode(1);
            ListNode first1 = new ListNode(2);
            ListNode first2 = new ListNode(3);
            ListNode first3 = new ListNode(4);
            ListNode first4 = new ListNode(5);

            
        }
        public void removeLoop(){
            ListNode fastPtr = head;
            ListNode slowPtr = head;


            while(fastPtr != null && fastPtr.next != null){
                fastPtr = fastPtr.next.next;

                slowPtr = slowPtr.next;

                if(slowPtr == fastPtr){
                    removeLoop(slowPtr);
                }
            }
        }

    public void  removeLoop(ListNode slowptr){
        ListNode temp = head;

        while(temp.next != slowptr.next){
            temp = temp.next;
            slowptr = slowptr.next;
        }
        
        slowptr.next = null;

    }
    public static ListNode merge(ListNode a,ListNode b){
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while( a != null && b != null){

            if(a.data <= b.data){
                tail.next = a;
                a= a.next;
            }else{
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }


        if ( a == null){
            tail.next = b;

        }else{

            tail.next = a;

        }
        return  dummy.next;



    }




  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);   
        First_problem sll = new First_problem();
        sll.inssertFirst(10);
        sll.inssertFirst(60);
        sll.inssertFirst(70);

       sll.display();


       ListNode nthNodeFromEnd = sll.getNthNodeFromEnd(2);


       


      

       
    

        
    }
}






    
    
