import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class StoreElementsInHashSet {
    public static void main(String[] args) {
        HashSet <Integer> hashset = new HashSet<>();

        hashset.add(10);
        hashset.add(19);
        hashset.add(10);
        hashset.add(191);
        hashset.add(13);
        hashset.add(111);
        hashset.add(90);
        hashset.add(17);

        System.out.println(hashset);

        ArrayList <Integer> arrayList = new ArrayList<>(hashset);

        Collections.sort(arrayList);
        System.out.println(arrayList);
    }   
}
