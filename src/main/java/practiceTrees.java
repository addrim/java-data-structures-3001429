import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class practiceTrees {

    public static void main(String[] args) {

        //ordena los numeros
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(300);
        treeSet.add(47);
        treeSet.add(6);
        System.out.println(treeSet);
        //no agrega duplicados
        treeSet.add(6);
        System.out.println(treeSet);

        //guarda en orden alfabetico
        Set<String> wordSet = new TreeSet<>();
        wordSet.add("tiger");
        wordSet.add("giraffe");
        wordSet.add("bear");
        System.out.println(wordSet);

        //guarda en orden de longitud
        Set<String> wordSet2 = new TreeSet<>(Comparator.comparing(String::length));
        wordSet2.addAll(Arrays.asList("tiger","giraffe","bear"));
        System.out.println(wordSet2);
        wordSet2.add("wolf"); //al tener 4 letras como tiger lo toma como duplicado y no lo agrega
        System.out.println(wordSet2);
        wordSet2.remove("giraffe");
        System.out.println(wordSet2);
    }
}
