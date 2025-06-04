import java.util.ArrayDeque;
import java.util.Deque;

public class practiceDeques {

    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>();
        stack.push("First request");
        stack.push("Second request");
        stack.push("Third request");
        System.out.println(stack);

        //Trae el top
        System.out.println(stack.peek());

        //Borra el top, si esta vacío marca error
        stack.pop();
        System.out.println(stack);

        //Borra el top
        stack.poll();
        System.out.println(stack);
    }
}
