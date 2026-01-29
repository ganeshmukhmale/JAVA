import java.util.ArrayList;

public class FindSumOfElements {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();

        arrayList.add(41);
        arrayList.add(42);
        arrayList.add(43);
        arrayList.add(44);
        arrayList.add(45);

        int sum = 0;
        for(Integer i:arrayList){
            sum = sum+i;
        }

        System.out.println(sum);
    }
}
