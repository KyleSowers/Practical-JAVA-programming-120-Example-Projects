//PRACTICE 109: A PROGRAM TO SYNC ARRAY LIST USING COLLECTIONS.SYNCHOCHRONISELIST
package SynchronizeArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SyncArray implements  Cloneable {
    public static void main(String[] args) {
        //create new list for strings
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
        //add strings ti list
        list.add("111");
        list.add("222");
        list.add("333");
        list.add("444");
        list.add("555");
        list.add("666");
        list.add("777");
        list.add("888");
        list.add("999");
        // method to iterate list
        synchronized (list) {
            Iterator<String> it = list.iterator();
            while(it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
}
