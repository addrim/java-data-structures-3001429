import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class practiceLinkList {

    public static void main(String[] args) {
        // tiene mejor desempeño para agregar y borrar elementos
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("apple");
        shoppingList.add("banana");
        shoppingList.add("pear");
        System.out.println(shoppingList);

        shoppingList.add(1, "mango");
        System.out.println(shoppingList);

        //addFirst, addLast, removeFirst, removeLast
        shoppingList.addFirst("afirst");
        System.out.println(shoppingList);

        shoppingList.addLast("zlast");
        System.out.println(shoppingList);

        shoppingList.removeFirst();
        System.out.println(shoppingList);

        shoppingList.removeLast();
        System.out.println(shoppingList);

        List<String> syncronizedShoppingList = Collections.synchronizedList(shoppingList);
        System.out.println("sync: " + syncronizedShoppingList);
    }
}