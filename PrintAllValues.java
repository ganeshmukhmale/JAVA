import java.util.HashMap;

public class PrintAllValues {
    public static void main(String[] args) {
        HashMap <Integer, String> hashmap = new HashMap<>();

        hashmap.put(28, "Pranav");
        hashmap.put(13, "Gajanan");
        hashmap.put(36, "Bharat");
        hashmap.put(46, "Ganesh");
        System.out.println(hashmap.values());
    }
}
