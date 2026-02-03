import java.util.HashMap;

public class StoreStudentRollName {
    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();
        student.put(46, "Ganesh");
        System.out.println(student.get(46));
    }
}
