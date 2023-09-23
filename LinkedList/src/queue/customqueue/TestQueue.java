package queue.customqueue;

public class TestQueue {
    public static void main(String[] args) {
        System.out.println("hi");

        Queue queue = new Queue();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);



        queue.display();
        System.out.println("");
        queue.remove();
        queue.display();
        System.out.println("");

        queue.remove();
        queue.display();
        System.out.println("");

        queue.remove();
        queue.display();



    }
}
