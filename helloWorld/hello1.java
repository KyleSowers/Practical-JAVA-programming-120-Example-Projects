//PRACTICE 81: A PROGRAM TO SORT HASHMAP
package helloWorld;

import java.util.*;

public class hello1 {

    public static void main(String[] args) {
        //create new hashmap
        HashMap<String, Integer> mp = new HashMap();
        //put key value pairs of String/Integer
        mp.put("g Saturday", 6);
        mp.put("e, Thursday", 4);
        mp.put("b, Tuesday", 2);
        mp.put("f, Friday", 5);
        mp.put("h, Sunday", 7);
        mp.put("c, Wednesday", 3);
        mp.put("a, Monday", 1);
        //tell user about map values before sorting
        System.out.println("Maps before sorting: ");
        //set up read and display values with previous printing statement as a result
        Set st = mp.entrySet();
        Iterator it = st.iterator();
        while (it.hasNext()) {
            Map.Entry mpen = (Map.Entry)it.next();
            System.out.println(mpen.getKey() + " : " + mpen.getValue());
        }
        //create new line
        System.out.println("\n");
        //use treemap method with new map to sort in ascending order
        Map<String, Integer> mapsi = new TreeMap(mp);
        //begin print result statement
        System.out.println("Maps after sorting: ");
        //set up, read and print result
        Set st1 = mapsi.entrySet();
        Iterator it1 = st1.iterator();
        while (it1.hasNext()) {
            Map.Entry mpen1 = (Map.Entry)it1.next();
            System.out.println(mpen1.getKey() + " : " + mpen1.getValue());
        }
    }
}
