class Node{
    int data;
    Node next;

    public Node(int data,Node next){
        this.data=data;
        this.next=next;
    }
}

public class A{
    public static void main(String[] args) {
        Node n1= new Node(12,null);
        Node n2= new Node(2,null);
        Node n3= new Node(34,null);
        Node n4= new Node(-1,null);
        Node n5= new Node(28,null);

        n1.next=n2;
        n2.next=n5;
        n5.next=n3;
        n3.next=n4;

        Node head = n1;
        Node temp = head;

        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}