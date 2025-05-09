public class Main {

    public static void main(String[] args) {


        Stack stack = new StackLinkedList();
        // Stack stack = new StackArray();

        stack.push("This is a string.");
        stack.push(5);
        stack.peek(); // en üstteki item ı gösterir.
        System.out.println("is empty " + stack.isEmpty());

        System.out.println("Pop = " +stack.pop() );
        stack.peek();


    }

}
