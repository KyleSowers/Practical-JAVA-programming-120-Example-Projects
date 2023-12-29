//PRACTICE 69: A PROGRAM TO FIND TWO TOP MAXIMUM NUMBERS IN AN ARRAY
package TwoMaximums;

public class Array {
    public void MaximumNums(int[] num1) {
        //declare attributes
        int max1 = 0, max2 = 0;
        //for each element check condition / compare max1 and max 2 values for larger values to replace
        for (int x: num1) {
            if (max1 < x) {
                max2 =max1;
                max1 = x;
            } else if (max2 < x) {
                max2 = x;
            }
        }
        //print result of two Maximum Numbers
        System.out.println("The first Maximum Number is " + max1);
        System.out.println("The second Maximum Number is " + max2);
    }

    public static void  main(String[] args) {
        //declare array with values
        int num2[] = {4300, 78, 9, 34, 100, 5000, 432, 678, 12, 7, 3, 0, 654};
        //create new object of array
        Array ay = new Array();
        //use object to call method with argument where actions and results will be provided
        ay.MaximumNums(num2);
    }
}
