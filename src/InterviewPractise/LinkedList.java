package InterviewPractise;

public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        public Node(int data, Node next) {
            this.data = data;
            this.next = null;
        }

        public Node(int newData) {
            this(newData,null);
        }

        public int getData() {
            return  this.data;
        }
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public void printList(){
        Node n = head;
        while(n!=null){
            System.out.println(n.getData()+" ");
            n=n.next;
        }
    }
    public void push(int newData){
        Node newNode = new Node(newData);
        newNode.next = head;
        head=newNode;
    }

    boolean isCircular(){
        Node crawl = head;

        while(crawl!=null){
            crawl=crawl.next;
            if(crawl==head){
                return true;
            }
        }
        return false;
    }
    void makeCircular(){
        Node crawl=head;
        while(crawl.next!=null){
            crawl=crawl.next;
        }
        crawl.next=head;
    }
}
