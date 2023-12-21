//PRACTICE 48: A PROGRAM TO SORT A MERGED ARRAY
package MergeSort;

public class Array {

    public static void sort(int[] x, int lower, int upper) {
        int num1 = upper - lower;
        if (num1 <= 1) {
            return;
        }
        int num2 = lower + num1/2;

        sort(x, lower, num2);
        sort(x, num2, upper);

        int[] num3 = new int[num1];
        int y = lower, z = num2
    }
}
