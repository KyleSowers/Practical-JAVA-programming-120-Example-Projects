//PRACTICE 110: A PROGRAM TO GET THE LAST OCCURRENCE OF AN OBJECT IN AN ARRAY LIST
package LastOccuranceOfObject;

import java.util.ArrayList;
import java.util.List;

public class OccuranceOfObject {
    public static void  main(String[] args) {
        //create new list for strings
        List<String> list1 = new ArrayList<String>();
        //add strings to list
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
        //show user list size
        System.out.println("The size of the list is: " + list1.size());
        //print statements to user advising last occurrences of different strings in list
        System.out.println("last occurrence of 000 is: " + list1.lastIndexOf("000"));
        System.out.println("last occurrence of 111 is: " + list1.lastIndexOf("111"));
        System.out.println("last occurrence of 222 is: " + list1.lastIndexOf("222"));
        System.out.println("last occurrence of 333 is: " + list1.lastIndexOf("333"));
        System.out.println("last occurrence of 444 is: " + list1.lastIndexOf("444"));
        System.out.println("last occurrence of 555 is: " + list1.lastIndexOf("555"));
        System.out.println("last occurrence of 888 is: " + list1.lastIndexOf("888"));

    }
}
