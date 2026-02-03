import java.util.HashMap;
// import java.util.Set;
// import java.util.Map.Entry;

public class PrintAllKeys {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();

        student.put(28, "Pranav");
        student.put(13, "Gajanan");
        student.put(36, "Bharat");
        student.put(46, "Ganesh");
        // Set<Integer> set = student.keySet();
        // System.out.println(set);

        System.out.println(student.keySet());
     

    }
}
