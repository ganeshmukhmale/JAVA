import java.util.ArrayList;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList <Integer> arrayList = new ArrayList<>();

        arrayList.add(35);
        arrayList.add(79);
        arrayList.add(02);
        arrayList.add(31);
        arrayList.add(93);

        int arr[] = new int[arrayList.size()];
        for(int i=0;i<arrayList.size();i++){
            arr[i] = arrayList.get(i);        
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
