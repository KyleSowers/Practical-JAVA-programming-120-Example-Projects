//PRACTICE 100: A PROGRAM FOR MULTIPLE CATCH BLOCKS IN EXCEPTION HANDLING
package MultipleCatchBlocks;

import IntersectionOfTwoArrays.ArrayIntersection;

public class ExceptionHandling {
    public static void main(String[] args) {
        //create try statement with body
        try {
            int x[] = new int[10];
            x[5] = 4/8;

//            System.out.println(y);
            //create catch error conditionals
        } catch (ArithmeticException e) {
            System.out.println("This is an " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This is an " + e);
        } catch (Exception e) {
            System.out.println("This is an " + e);
        }
        //print advising the try-catches has been completed
        System.out.println("Out of try-catch block");
    }
}
