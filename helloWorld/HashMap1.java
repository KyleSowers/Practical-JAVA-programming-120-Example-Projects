//PRACTICE 80: A PROGRAM TO ITERATE THROUGH HASHMAP
package helloWorld;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap1 {
    public static void main(String[] args) {
    //create new hashmap
    Map<String, String> mp = new HashMap<String, String>();
    //store key/value pairs into the hashmap
    mp.put("1", "Monday");
    mp.put("2", "Tuesday");
    mp.put("3", "Wednesday");
    mp.put("4", "Thursday");
    mp.put("5", "Friday");
    mp.put("6", "Saturday");
    mp.put("7", "Sunday");
    //create iterator to read and implement enteries to hashmap
    Iterator<Map.Entry<String, String>> it = mp.entrySet().iterator();
    //under the while condition, continue to add entries into the hashmap and print result.
    while (it.hasNext()) {
        Map.Entry<String, String> entry = (Map.Entry<String, String>)it.next();
        System.out.println("Key " + entry.getKey() + "Value is: " + entry.getValue());
    }
    }
}
