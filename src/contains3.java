import java.util.*;

/**
 * Created by Jakob on 31-08-2016.
 */
public class contains3 {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList("Hi", "mate", "seems", "like", "like", "like", "you", "could", "use", "a", "hug"));


        System.out.println(contain3(list));
    }

    private static boolean contain3(List<String> list) {

        Map<String, Integer> count = new HashMap<String, Integer>();


        for (String s : list) {

            String word = s;

            if (count.containsKey(word)) {
                int counter = count.get(word);
                count.put(word, counter + 1);
            } else {
                count.put(word, 1);
            }
        }
        if (count.containsValue(3)) {
            return true;
        } else {
            return false;
        }
    }
}
