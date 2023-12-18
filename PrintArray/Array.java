//PRACTICE 38: A PROGRAM TO PRINT OUT ARRAYS
package PrintArray;

public class Array {
    public static void main(String args[]) {
        //declare array with values
        int x[] = {1, 2, 3, 4, 5, 6, 7, 8};
        //initial print statement of a string
        System.out.println("Our Array is: ");
        //for loop to iterate through array length and print each index
        for (int y = 0; y < x.length; y++) {
            System.out.println(" " + x[y]);
        }
    }
}
