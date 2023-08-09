package linked_lists;

public class SLL {
    private Node head;
    private Node tail;
    private int size;

    public SLL() {
        this.size = 0;
    }

    public static void main(String[] args) {

    }

//    insert elements using recursion
//    public void insertRec(int index,int value){
//        head=insertRec(index,value,head);
//    }
//    private Node insertRec(int index,int value,Node node){
//        if (index==0){
//            Node temp=new Node(value,node);
//            size++;
//            return temp;
//        }
//        node.next=insertRec(index--,value,node.next);
//        return node;
//    }


    // QUESTION 1 : REMOVE DUPLICATES FROM SORTED LINKED LIST
    public void removeDuplicates(){
        Node node=head;
        while (node.next != null){
            if (node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }
            else {
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }
    public void addFirst(int value){
        Node temp=new Node(value);
        temp.next=head;
        head=temp;
        if (tail==null){
            tail=head;
        }
        size++;
    }
    public void print(){
        Node temp=head;
        while (temp != null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void addLast(int value){
        if (tail==null){
            addFirst(value);
            return;
        }
        Node temp=new Node(value);
        tail.next=temp;
        tail=temp;

        size++;
    }
    public void addAt(int value,int index){
        if (index==0){
            addFirst(value);
            return;
        }
        if (index>=size){
            addLast(value);
            return;
        }
        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }
        Node node =new Node(value,temp.next);
        temp.next=node;
        size++;
    }
    public int deleteFirst(){
       int value= head.value;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return value;
    }
    public Node getNode(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    public int delete(int index){
        if (index==0){
            return deleteFirst();
        }
        if (index==size-1){
            return deleteLast();
        }
        Node prev=getNode(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
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

    public int deleteLast(){
        if (size<=1){
            return deleteFirst();
        }
        Node secondLast=getNode(size-2);
        int val= tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return val;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
