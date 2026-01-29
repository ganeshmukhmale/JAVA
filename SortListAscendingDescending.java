import java.util.ArrayList;
import java.util.Collections;

public class SortListAscendingDescending {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();

        arrayList.add(35);
        arrayList.add(79);
        arrayList.add(02);
        arrayList.add(31);
        arrayList.add(93);
        arrayList.add(34);

        // For Accending Order
        Collections.sort(arrayList);
        System.out.println("Accending Order of List is: "+arrayList);

        // For Decending Order
        Collections.sort(arrayList, Collections.reverseOrder());
        System.out.println("Decending Order of List is: "+arrayList);
    }
}
