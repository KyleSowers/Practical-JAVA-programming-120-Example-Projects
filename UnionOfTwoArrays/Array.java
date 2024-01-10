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
        int[] rest1 = {};
        int i = 0, j = 0;

        while (i < x.length && j < y.length) {
            if (x[i] < y[j]) {
                rest1 = sumElement(rest1, x[i]);
                i++;
            } else if (x[i] == y[j]) {
                rest1 = sumElement(rest1, x[i]);
                i++;
                j++;
            } else {
                rest1 = sumElement(rest1, y[j]);
                j++;
            }
        }
        int z;
    }
    public static void main(String[] args) {

    }
}
