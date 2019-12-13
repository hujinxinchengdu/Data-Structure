

public class LinkedList<E> {
    private class Node{
        public E e;
        public Node next;

        public Node(E e, Node next){
            this.e = e;
            this.next = next;
        }

        public Node(E e){
            this(e, null);
        }

        public Node(){
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
    private Node dummyhead;
    int size;

    public LinkedList(){
        dummyhead = new Node(null, null);
        size = 0;
    }

    /**
     * Get the number of elements in the linkedlist
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * Returns whether the linkedlist is empty
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }


    /**
     * Add a new element e at index(0-based) position of the LinkedList
     * @param index
     * @param e
     */
    public void add(int index, E e){
        if(index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Illegal index");
        }

        Node prev = dummyhead;
        for(int i = 0; i < index; i++){
            prev = prev.next;
//                Node node = new Node(e);
//                node.next = prev.next;
//                prev.next = node;

            prev.next = new Node(e, prev.next);
            size++;
        }
    }

    /**
     * Add a new element e at the beginning of the linked list
     * @param e
     */
    public void addFirst(E e){
        add(0,e);
    }

}
