//PRACTICE 110: A PROGRAM TO GET THE LAST OCCURRENCE OF AN OBJECT IN AN ARRAY LIST
package LastOccuranceOfObject;

import java.util.ArrayList;
import java.util.List;

public class OccuranceOfObject {
    public static void  main(String[] args) {
        List<String> list1 = new ArrayList<String>();

        list1.add("000");
        list1.add("222");
        list1.add("444");
        list1.add("333");
        list1.add("222");
        list1.add("000");
        list1.add("111");
        list1.add("555");
        list1.add("888");
        list1.add("444");
        list1.add("333");
        list1.add("000");
        list1.add("111");
        list1.add("222");
        list1.add("444");
        list1.add("555");

        System.out.println("The size of the list is: " + list1.size());

        System.out.println("last occurrence of 000 is: " + list1.lastIndexOf("000"));
        System.out.println("last occurrence of "111" is: " + list1.lastIndexOf("111"));

    }
}
