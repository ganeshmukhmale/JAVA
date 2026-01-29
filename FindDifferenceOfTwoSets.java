import java.util.HashSet;
import java.util.Set;

public class FindDifferenceOfTwoSets {
    public static void main(String[] args) {
        Set <Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(2);
        set1.add(2);

        Set <Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        set1.removeAll(set2);
        System.out.println(set1);
    }
}
