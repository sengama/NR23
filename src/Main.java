import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("A", 1);
        linkedHashMap.put("B", 2);
        linkedHashMap.put("C", 3);


        LinkedHashSet<Integer> values = new LinkedHashSet<>();
        for (Integer value : linkedHashMap.values()) {
            values.add(value);
        }


        LinkedList<String> keys = new LinkedList<>();
        for (String key : linkedHashMap.keySet()) {
            keys.add(key);
        }

        System.out.println("Complexitatea parcurgerii unui LinkedHashMap este O(n)");
        System.out.println("Complexitatea adăugării unui element într-un LinkedHashSet este O(1)");
        System.out.println("Complexitatea adăugării unui element într-un LinkedList este O(1)");
    }
}
