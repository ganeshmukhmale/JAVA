import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(35);
        arrayList.add(79);
        arrayList.add(02);
        arrayList.add(31);
        arrayList.add(93);
        arrayList.add(34);
        arrayList.add(35);
        arrayList.add(79);
        arrayList.add(02);
        arrayList.add(31);
        arrayList.add(93);
        arrayList.add(34);

        // Befour Removing Dublicate Elements
        System.out.println("Befour Removing Dublicate Elements: "+arrayList);

        // After Removing Dublicate Elements
        LinkedHashSet set = new LinkedHashSet<>(arrayList);
        arrayList = new ArrayList<>(set);
        System.out.println("After Removing Dublicate Elements: "+arrayList);
    }
}