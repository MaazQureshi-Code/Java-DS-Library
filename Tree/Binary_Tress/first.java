import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class first {
    private TreeNode root;

    private class TreeNode{
        private TreeNode left;
        private TreeNode righT;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }
    }


        public void createBinaryTree(){
            TreeNode first = new TreeNode(9);
            TreeNode second = new TreeNode(2);
            TreeNode thired = new TreeNode(3);
            TreeNode fourth = new TreeNode(4);
        
            root = first; /// root ----> first
            first.left = second; //          
            first.righT = thired;             
            second.left = fourth;
        }

        public void preOrder(TreeNode root){
            if(root == null){
                return;
            }

            System.err.println(root.data + " ");

            preOrder(root.left);
            preOrder(root.righT);

        }

        public void preOrder_Stack() {
        if (root == null) {
            return; // If the tree is empty, return
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            System.out.print(temp.data + " ");

            if (temp.righT != null) {
                stack.push(temp.righT);
            }
            if (temp.left != null) {
                stack.push(temp.left);
            }
        }
    }
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.righT);
    }


    public void inOrder_stack(TreeNode root){
        if(root == null){
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;

        while(!stack.isEmpty() || temp != null){
            if(temp != null){

                stack.push(temp);
                temp = temp.left;

            }else{
                temp = stack.pop();
                System.out.println(temp.data +" ");
                temp = temp.righT;
            }
        }
    }



    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.righT);
        System.err.print(root.data + " ");
    }


    public void postOrder_stack(TreeNode root){
        TreeNode current  = root;
        Stack<TreeNode> stack = new Stack<>();
        while(current != null || !stack.isEmpty()){

            if(current != null){
                stack.push(current);
                current = current.left;
            }else{
                TreeNode temp = stack.peek().righT;
                if (temp == null) {

                    temp = stack.pop();
                    System.out.println(temp.data + " ");
                    while (!stack.isEmpty() && temp ==  stack.peek().righT) {
                        temp = stack.pop();
                        System.out.print(temp.data  + " ");
                    }
                }else{
                    current = temp;
                }
            }
        }
    }

    public void levelOrder(){
        if(root == null){
            return;
        }

        Queue<TreeNode> queue = new LinkedList();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            System.out.print( temp.data + " ");
            if(temp.left != null){
                queue.offer(temp.left);
            }

            if(temp.righT != null){
                queue.offer(temp.righT);
            }
            
        }
    }

    public int findMax() {
        return findMax(root);
    }
    
    public int findMax(TreeNode root) {
        if (root == null) {
            return Integer.MIN_VALUE; // Correct value for the base case
        }
    
        int result = root.data;
        int left = findMax(root.left);  // Correct property
        int right = findMax(root.righT); // Correct property
    
        if (left > result) {
            result = left;
        }
        if (right > result) {
            result = right;
        }
    
        return result;
    }

    public static void main(String[] args) {

      first bt = new first();
      bt.createBinaryTree();
      System.err.println(bt.findMax(bt.root));
    
    
 

    
    }
}
