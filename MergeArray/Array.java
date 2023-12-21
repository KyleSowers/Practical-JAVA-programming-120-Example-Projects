//PRACTICE 47: A PROGRAM TO MERGE TWO ARRAYS
package MergeArray;

import java.util.ArrayList;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        String x[] = {"H", "E", "L", "L", "O"};
        String y[] = {"W", "O", "R", "L", "D"};

        List ls = new ArrayList(Arrays.aslist(x));
        ls.addAll(Arrays.asList(y));
    }
}
