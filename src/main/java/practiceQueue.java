import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class practiceQueue {

    public static void main(String[] args) {
        //Colas FIFO
        Queue<String> queue = new ArrayDeque<>();
        //Queue<String> queue = new LinkedList<>(); //Identico a ArrayDeque
        //Queue<String> queue = new PriorityQueue<>(); //Los ordena alfaberto o numeros mayor a menor
        queue.offer("Person One");
        queue.offer("Person Two");
        queue.offer("Person Three");
        System.out.println(queue);

        //Trae el primero que entro
        System.out.println(queue.peek());

        //Borra el primero que entro
        queue.poll();
        System.out.println(queue);
    }
}
