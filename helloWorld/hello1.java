//PRACTICE 81: A PROGRAM TO SORT HASHMAP
package helloWorld;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

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
    }
}
