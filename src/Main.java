public class Main {
    public static void main(String[] args) throws Exception {
        MyLinkedList ll = new MyLinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.display();
        ll.reverseInGroup(3);
        ll.display();
        for(int i=10; i<20; i++) {
            ll.addLast(i);
        }
        ll.display();
        ll.deleteMAfterN(2,0);
        ll.display();
    }
}
