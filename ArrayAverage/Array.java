//PRACTICE 52: A PROGRAM TO CALCULATE ARRAYS AVERAGE
package ArrayAverage;

public class Array {
    public static void main(String[] args) {
        //create new array with associated element values
        int[ ] num1 = new int[] {66, 4, 89, 7, 23, 12, 54, 70, 97, 200};
        //create new variable that will hold sum value
        int sum = 0;
        //for loop to read through length of array
        for  (int  y = 0; y < num1.length; y++) {
            //add for sum and stroe into sum attribute
            sum = sum + num1[y];
        }
        //create average attribute that factors average using the sum attribute
        float average = sum/num1.length;
        //print result using average attribute
        System.out.println("The result of the array average is: " + average);
    }
}
