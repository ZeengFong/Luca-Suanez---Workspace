public class linkedlist {
    static class Node {
        int data;
        Node next;
        Node last;
        Node(int data) {
            this.data = data;
            this.next = null;
            this.last = null;
        }
    }

    public static void add(int data) {
        
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        head.next = second;
        head.last = null;
        second.next = third;
        second.last = head;
        third.next = null;
        third.last = second;
        Node n = head;
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }
}
