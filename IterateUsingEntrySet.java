import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map.Entry;

public class IterateUsingEntrySet {
    public static void main(String[] args) {
        HashMap <Integer, String> hashmap = new HashMap<>();

        hashmap.put(28, "Pranav");
        hashmap.put(13, "Gajanan");
        hashmap.put(36, "Bharat");
        hashmap.put(46, "Ganesh");

        Set<Entry<Integer, String>> sets = hashmap.entrySet(); 
        for (Entry<Integer,String> entry : sets) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
