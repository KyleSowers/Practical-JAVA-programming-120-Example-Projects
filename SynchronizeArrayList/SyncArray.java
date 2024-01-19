//PRACTICE 109: A PROGRAM TO SYNC ARRAY LIST USING COLLECTIONS.SYNCHOCHRONISELIST
package SynchronizeArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SyncArray implements  Cloneable {
    public static void main(String[] args) {
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
    }
}
