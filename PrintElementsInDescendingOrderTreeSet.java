import java.util.TreeSet;

public class PrintElementsInDescendingOrderTreeSet {
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

        System.out.println("Befor Decending Order: "+treeSet);
        System.out.println("After Decending Order: "+treeSet.descendingSet());
    }
}
