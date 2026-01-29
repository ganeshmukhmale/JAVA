// WAP to store 5 values in Vector and arrange in ascending without using sort() methods of Collections

import java.util.Scanner;
import java.util.Vector;

public class Vector1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Vector<Integer> v = new Vector<>();


        for(int i = 0;i<5;i++ ){
            v.add(sc.nextInt());
        }

        System.out.println("Vector Elemenyts: "+ v);

        for(int i = 0; i < v.size()-1; i++) {
            for(int j = 0; j < v.size()-1-i; j++) {

                if(v.get(j) > v.get(j+1)) {
                    int temp = v.get(j);
                    v.set(j, v.get(j+1));
                    v.set(j+1, temp);
                }
            }
        }
        System.out.println("After Sorting Elements: "+ v);
    }
}
