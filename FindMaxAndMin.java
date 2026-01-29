import java.util.ArrayList;

public class FindMaxAndMin {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();

        arrayList.add(41);
        arrayList.add(47);
        arrayList.add(43);
        arrayList.add(90);
        arrayList.add(1);

        int max = arrayList.get(0);
        int min = arrayList.get(0);

        for (Integer num : arrayList) {
            if(num<min)min=num;
            if(num>max)max=num;
        }
        System.out.println(min);
        System.out.println(max);
    }
}
