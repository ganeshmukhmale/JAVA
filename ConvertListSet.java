import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ConvertListSet {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(82);
        list.add(82);
        list.add(86);
        list.add(90);
        list.add(90);

        System.out.println(list);
        HashSet <Integer> set = new HashSet<>(list);

        System.out.println(set);
    }
}
