package task_13.task_13_13;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement != null) && (currentElement != last)) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node node = new Node();
        node.value = value;
        if (last.prev == null) {
            first.next = node;
        } else {
            node.prev = last.prev;
            last.prev.next = node;
        }
        node.next = last;
        last.prev = node;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }
}
