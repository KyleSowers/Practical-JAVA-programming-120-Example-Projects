//PRACTICE 96: A PROGRAM TO FIND THE UNION OF TWO ARRAYS
package UnionOfTwoArrays;

import java.util.Arrays;

public class Array {
    public static int[] sumElement(int[] num1, int sumed) {
        int[] output = Arrays.copyOf(num1, num1.length+1);
        output[num1.length] = sumed;
        return output;
    }

    public static int[] Total(int[] x, int[] y) {

    }
    public static void main(String[] args) {

    }
}
