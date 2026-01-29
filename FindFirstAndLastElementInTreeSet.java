import java.util.TreeSet;

public class FindFirstAndLastElementInTreeSet {
    public static void main(String[] args) {
        TreeSet <Integer> treeSet = new TreeSet<>();
        treeSet.add(82);
        treeSet.add(92);
        treeSet.add(86);
        treeSet.add(90);
        treeSet.add(50);
        treeSet.add(32);
        treeSet.add(54);
        treeSet.add(78);

        // Element sort automatically according to Accending Order

        System.out.println("First Index Of Treeset is: "+treeSet.first());
        System.out.println("Last Index Of Treeset is: "+treeSet.last());
    }
}
