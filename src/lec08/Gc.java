package lec08;

class Node {
    Node next;
}

public class Gc {
    public static void main(String[] args) {
        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Node d = new Node();

        a.next = b;
        b.next = c;

        // d는 누구도 참조하고 있지 않기 때문에 삭제 대상.
    }
}
