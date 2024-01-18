//PRACTICE 108: A PROGRAM TO GET SUB-LIST FROM AN ARRAY WITH CLONE
package ArraySubListwithClone;

import java.util.ArrayList;
import java.util.List;

public class ArraySubList {
    public static void main(String args[]) {

        ArrayList<String> alist = new ArrayList<String>();

        alist.add("111");
        alist.add("222");
        alist.add("333");
        alist.add("444");
        alist.add("555");
        alist.add("666");
        alist.add("777");
        alist.add("888");
        alist.add("999");

        System.out.println("Total arraylist is: " + alist);

        List<String> list1 = alist.subList(2, 5);
    }
}
