import java.util.ArrayList;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        int arr[] = {10,76,34,91,48}; 

        ArrayList <Integer> arrayList = new ArrayList<>();

        for(Integer num : arr ){
            arrayList.add(num);
        }
        
        System.out.println(arrayList);
    }
}
