public class Main {
    public static void main (String[] args){

        LinkedList<Integer> Linkedlist = new LinkedList<>();
        for(int i = 0; i < 5; i++){
            Linkedlist.addFirst(i);
            System.out.println(Linkedlist);
        }
        Linkedlist.add(2, 666);
        System.out.println(Linkedlist);


    }
}
