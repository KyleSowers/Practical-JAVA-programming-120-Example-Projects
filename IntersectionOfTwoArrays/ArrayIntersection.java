//PRACTICE 97: A PROGRAM TO FIND INTERSECTION OF TWO ARRAYS
package IntersectionOfTwoArrays;

import java.util.Arrays;

public class ArrayIntersection {

    public static int[] sumElement(int[] x, int intersect) {

        int[] output = Arrays.copyOf(x, x.length + 1);
        output[x.length] = intersect;
        return output;
    }

    public static int[] IntersectElement(int[] y, int[] z) {

    }

    public static void main(String[] args) {


    }
}
