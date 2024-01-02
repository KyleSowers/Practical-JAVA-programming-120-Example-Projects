//PRACTICE 79: A PROGRAM FOR ARRAY LIST
package ArrayList;

import java.util.ArrayList;

public class Array {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("USA");
        list.add("Canada");
        list.add("Nigeria");
        list.add("China");

        System.out.println("These are the elements of array list: " + list);

        //add elements into the array using index
        list.add(0, "Mexico");
        list.add(3, "Ghana");
        System.out.println("These are the current elements: " + list);

        //remove elements from array
        list.remove(1);
        list.remove(4);
    }
}
