package linked_lists;

public class Circular_LL_Use {
    public static void main(String[] args) {
        Circular_LL list= new Circular_LL();
        list.addLast(8);
        list.addLast(9);
        list.addLast(2);
        list.addLast(7);
        list.addLast(17);
        list.print();
        list.delete(17);
        list.print();
    }
}
