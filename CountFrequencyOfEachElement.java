import java.util.*;

public class CountFrequencyOfEachElement {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();

        arrayList.add(35);
        arrayList.add(79);
        arrayList.add(02);
        arrayList.add(31);
        arrayList.add(93);
        arrayList.add(34);
        arrayList.add(35);
        arrayList.add(79);
        arrayList.add(02);

        HashMap <Integer, Integer> map = new HashMap<>();

        for (Integer num : arrayList) {
            map.put(num, map.getOrDefault(num, 0)+1);  
        }

        System.out.println(map);
    }
}
