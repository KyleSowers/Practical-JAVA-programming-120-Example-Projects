//PRACTICE 108: A PROGRAM TO GET SUB-LIST FROM AN ARRAY WITH CLONE
package ArraySubListwithClone;

import java.util.ArrayList;
import java.util.List;

public class ArraySubList {
    public static void main(String args[]) {
        //create new arraylist
        ArrayList<String> alist = new ArrayList<String>();
        //add to arraylist
        alist.add("111");
        alist.add("222");
        alist.add("333");
        alist.add("444");
        alist.add("555");
        alist.add("666");
        alist.add("777");
        alist.add("888");
        alist.add("999");
        //show arraylist
        System.out.println("Total arraylist is: " + alist);
        //create new sub list from index 2 up to/not including 5
        List<String> list1 = alist.subList(2, 5);
        //show sublist
        System.out.println("The result of the sublist is: " + list1);
        //create new sublist from index 3 up to/not including 6
        ArrayList<String> list2 = new ArrayList<String>(alist.subList(3, 6));
        //show stored list
        System.out.println("The result of the stored is: " + list2);
    }
}
