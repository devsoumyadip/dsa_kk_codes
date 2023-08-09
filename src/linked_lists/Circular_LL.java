package linked_lists;

public class Circular_LL {
    private Node head;
    private Node tail;
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value,Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void addLast(int value){
        Node node =new Node(value);
        if (head==null){
            head=node;
            tail=node;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void print(){
        Node node=head;
        if (head !=null){
            do {
                System.out.print(node.value+" -> ");
                node=node.next;
            }while (node != head);
            System.out.println("HEAD");
        }
    }
    public void delete(int value){
        Node node=head;
        if (head==null){
            return;
        }
        if (node.value==value){
            head=head.next;
            tail.next=head;
            return;
        }
        do {
            Node n=node.next;
            if (n.value==value){
                node.next=n.next;
                break;
            }
            node=node.next;
        } while (node != head);
    }
}
