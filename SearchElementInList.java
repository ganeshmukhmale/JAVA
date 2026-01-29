import java.util.ArrayList;

public class SearchElementInList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(35);
        arrayList.add(79);
        arrayList.add(02);
        arrayList.add(31);
        arrayList.add(93);

        int search = 34;
        if(arrayList.contains(search)){
            System.out.println("Element Found At index: "+arrayList.indexOf(search));
        }
        else{
            System.out.println("Element is Not Found.");
        }
    }
}
