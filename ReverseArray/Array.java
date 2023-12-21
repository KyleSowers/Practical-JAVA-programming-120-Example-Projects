package ReverseArray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("E");
        al.add("J");
        al.add("I");
        al.add("K");
        al.add("E");

        System.out.println("Before reversal: " + al);

        Collections.reverse(al);
    }
}
