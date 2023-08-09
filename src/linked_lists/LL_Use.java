package linked_lists;

public class LL_Use {
    public static void main(String[] args) {
        SLL list=new SLL();
        list.addFirst(12);
        list.addFirst(13);
        list.addFirst(15);
        list.addFirst(14);
        list.addLast(10);
        list.addAt(500,300);
        System.out.println(list.deleteFirst());
        list.print();
        System.out.println(list.deleteLast());
        list.print();
        System.out.println(list.delete(2));
        list.print();
        System.out.println(list.find(10));
//        list.insertRec(1,222);
        list.addFirst(15);
        list.addFirst(15);
        list.addFirst(14);
        list.addFirst(14);
        list.print();
        list.removeDuplicates();
        list.print();
    }
}
