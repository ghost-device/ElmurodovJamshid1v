import java.util.Objects;

public class SinglyLinkedList<E> {
    private Node head;
    private Node last;
    private int size = 0;

    private class Node {
        private Node next;
        private E val;

        public Node(E val) {
            this.val = val;
        }
    }

    public void add(E e){
        if (Objects.isNull(head)){
            head = new Node(e);
            last = head;
        } else {
            last.next = new Node(e);
            last = last.next;
        }
        size++;
    }

    public E get(int ind){
        Objects.checkIndex(ind, size - 1);

        int c = 0;
        for (Node x = head; x != null; x = x.next){
            if (c == ind){
                return x.val;
            }
            c++;
        }

        return null;
    }

    public void remove(int ind){
        Objects.checkIndex(ind, size);

        if (ind == 0){
            head = head.next;
            size--;
            return;
        }

        int i = 1;
        Node prev = head;
        for (Node x = head.next; x != null; x = x.next){
            if (i == ind){
                prev.next = x.next;
                size--;
                return;
            }
            i++;
            prev = x;
        }
    }

    public boolean contains(E e){
        for (Node x = head; x != null; x = x.next){
            if (Objects.equals(x.val, e)){
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        for (Node x = head; x != null; x = x.next){
            sb.append(x.val).append(", ");
        }

        if (sb.length() > 1){
            sb.setLength(sb.length() - 2);
        }

        return sb.append("]").toString();
    }
}
