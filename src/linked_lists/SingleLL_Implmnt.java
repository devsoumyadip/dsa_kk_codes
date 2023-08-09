package linked_lists;

public class SingleLL_Implmnt {
    private int size;
    private Node head;
    private Node tail;

    public SingleLL_Implmnt(){
        this.size=0;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void addFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if (tail==null){
            tail=head;
        }
        size+=1;
    }
    public void addLast(int val){
        if (tail==null){
            addFirst(val);
            return;
        }
        Node node =new Node(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertAt(int val,int index){
        if (size==0){
            addFirst(val);
            return;
        }
        if (index==size){
            addLast(val);
            return;
        }
        Node temp=head;
        for (int i=1;i<index;i++){
            temp=temp.next;
        }
        temp.next= new Node(val,temp.next);    //Node node=new Node(val,temp.next)
                                                //temp.next=node

        size++;
    }
    public static void main(String[] args) {
        SingleLL_Implmnt list=new SingleLL_Implmnt();
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addLast(7);
        list.addLast(9);
        list.insertAt(100,2);
        System.out.println(list.size+" <- size");

        list.display();
    }
}
