package linked_lists;

public class DLL_use {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.addFirst(14);
        list.addFirst(13);
        list.addFirst(12);
        list.addFirst(11);
        list.addLast(15);
        list.addLast(16);
        list.insertAfter(15,155);
        list.insertAfter(155,1555);
        list.print();
    }
}
