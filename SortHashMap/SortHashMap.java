//PRACTICE 82: A PROGRAM TO SORT HASHMAP BY VALUES
package SortHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SortHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(7, "Sunday");
        hm.put(4, "Thursday");
        hm.put(2, "Tuesday");
        hm.put(5, "Friday");
        hm.put(1, "Monday");
        hm.put(6, "Saturday");
        hm.put(3, "Wednesday");

        System.out.println("Map before sorting");
        Set st = hm.entrySet();
        Iterator it = st.iterator();

        while (it.hasNext()) {
            Map.Entry mpen = (Map.Entry)it.next();
            System.out.println(mpen.getKey() + " : " + mpen.getValue());
        }

        Map<Integer, String> mp = sortByValues(hm);
        System.out.println("Map after sorting: ");
        Set st1 = mp.entrySet();
        Iterator it1 = st1.iterator();

        while (it1.hasNext()) {
            Map.Entry mpen1 = (Map.Entry)it1.next();
            System.out.println(mpen1.getKey() + " : " + mpen1.getValue());
        }
    }
}
