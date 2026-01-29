import java.util.HashSet;

public class RemoveDuplicatesFromArrayUsingHashSet {
    public static void main(String[] args) {
        int arr[] = {10,10,62,26,26,808,80,80};
        
        HashSet <Integer> hashset = new HashSet<>();

        for(Integer hash : arr){
            hashset.add(hash);
        }

        System.out.println(hashset);
    }
}
