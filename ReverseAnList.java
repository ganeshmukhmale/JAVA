import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ReverseAnList {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();

    list.add(41);
    list.add(47);
    list.add(43);
    list.add(90);
    list.add(1);

    Collections.reverse(list);
    System.out.print(list);

    // It print onliyS Numbers
    // for(int i=list.size()-1;i>=0;i--){
    //     System.out.print(list.get(i)+" ");
    // }
    }
}
