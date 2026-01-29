import java.util.HashSet;
import java.util.TreeSet;

public class SortHashSetUsingTreeSet {
    public static void main(String[] args) {
        HashSet <Integer> hashSet = new HashSet<>();
        hashSet.add(82);
        hashSet.add(92);
        hashSet.add(86);
        hashSet.add(90);
        hashSet.add(50);
        hashSet.add(32);
        hashSet.add(54);
        hashSet.add(78);

        TreeSet <Integer> treeSet = new TreeSet<>(hashSet);

        System.out.println(treeSet);
    }
}
