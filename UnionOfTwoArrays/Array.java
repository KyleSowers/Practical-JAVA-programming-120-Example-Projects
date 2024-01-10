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
        for (z = i; z < x.length; z++) {
            rest1 = sumElement(rest1, x[z]);
        }
        for (z = j; z < y.length; z++) {
            rest1 = sumElement(rest1, y[z]);
        }
        return rest1
    }
    public static void main(String[] args) {
        int[] x = {99, 600, 2, 5, 50, 72, 10};
        int[] y = {3, 5, 2, 10, 50, 1000, 8};

        Array al = new Array();

        Arrays.sort(x);
    }
}
