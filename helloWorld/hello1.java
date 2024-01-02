//PRACTICE 81: A PROGRAM TO SORT HASHMAP
package helloWorld;

import java.util.*;

public class hello1 {

    public static void main(String[] args) {

        HashMap<String, Integer> mp = new HashMap();

        mp.put("g Saturday", 6);
        mp.put("e, Thursday", 4);
        mp.put("b, Tuesday", 2);
        mp.put("f, Friday", 5);
        mp.put("h, Sunday", 7);
        mp.put("c, Wednesday", 3);
        mp.put("a, Monday", 1);

        System.out.println("Maps before sorting: ");
        Set st = mp.entrySet();
        Iterator it = st.iterator();
        while (it.hasNext()) {
            Map.Entry mpen = (Map.Entry)it.next();
            System.out.println(mpen.getKey() + " : " + mpen.getValue());
        }
        System.out.println("\n");

        Map<String, Integer> mapsi = new TreeMap(mp);
        System.out.println("Maps after sorting: ");
        Set st1 = mapsi.entrySet();
        Iterator it1 = st1.iterator();
        while (it.hasNext()) {
            Map.Entry mpen1 = (Map.Entry)it1.next();
            System.out.println(mpen1.getKey() + " : " + mpen1.getValue());
        }
    }
}
