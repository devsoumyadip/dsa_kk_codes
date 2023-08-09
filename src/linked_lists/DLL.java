package linked_lists;


public class DLL {
    Node head;
    private class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void addFirst(int value){
        Node node =new Node(value);
        node.prev=null;
        node.next=head;
        if (head != null){
            head.prev=node;
        }
        head=node;
    }

    public void addLast(int value){
        Node node=new Node(value);
        Node last=head;

        if (head==null){
            node.prev=null;
            head=node;
            return;
        }

        while (last.next != null){
            last=last.next;
        }
        last.next=node;
        node.prev=last;
        node.next=null;
    }
    public void insertAfter(int after,int value){
        Node prev=find(after);

        if (prev==null){
            System.out.println("doesn't exist");
            return;
        }
        Node node=new Node(value);
        node.next=prev.next;
        prev.next=node;
        node.prev=prev;
        if (node.next != null){
            node.next.prev=node;
        }
    }
    public void print(){
        Node node=head;
        Node tail=null;
        while (node != null){
            System.out.print(node.value+" -> ");
            tail=node;
            node=node.next;
        }
        System.out.println("END");
        System.out.println("print in revrese order : ");
        //print in rev
        while (tail != null){
            System.out.print(tail.value+" -> ");
            tail=tail.prev;
        }
        System.out.println("START");
    }
    public Node find(int value){
        Node node=head;
        while (node != null){
            if (node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
}
