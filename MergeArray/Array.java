//PRACTICE 47: A PROGRAM TO MERGE TWO ARRAYS
package MergeArray;


import java.util.*;

public class Array {
    public static void main(String args[]) {
        //declare two new String arrays
        String x[] = {"H", "E", "L", "L", "O"};
        String y[] = {"W", "O", "R", "L", "D"};
        //create new List that takes in value of array x
        List ls = new ArrayList(Arrays.asList(x));
        //combine in the value of array y to new list
        ls.addAll(Arrays.asList(y));
        //create new array and convert new list to array
        Object[] z = ls.toArray();
        //print array
        System.out.println(Arrays.toString(z));
    }
}
