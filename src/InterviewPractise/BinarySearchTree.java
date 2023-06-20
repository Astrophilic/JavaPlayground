package InterviewPractise;

public class BinarySearchTree {

    public Node head=null;

    static class Node{
        Node left;
        Node right;

        int value;

        public Node(Node left, Node right, int value) {
            this.left = left;
            this.right = right;
            this.value = value;
        }

        public Node(Node left, Node right) {
            this.left = left;
            this.right = right;

        }
        public Node(int value){
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }
    public  Node insert(Node head,int item){
        if(head==null){
            head= new Node(item);
            return head;
        }
        if(item< head.getValue()){
            head.left= insert(head.left,item);
        }
        else{
            head.right = insert(head.right,item);
        }
        return head;
    }
}
