//PRACTICE 55: A PROGRAM TO GENERATE RANDOM NUMBERS
package RandomNumbers;

import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        //declare new instance variable (attribute)
        int rand;
        //create new random object with imported random class
        Random radnum = new Random();
        //print initial output of string message
        System.out.println("The result of the random numbers are: ");
        //loop for creating desired amount of random numbers
        for ( rand = 1; rand <= 7; rand++) {
            //print random numbers
            System.out.print(radnum.nextInt(2000) + "\n");
        }
    }
}
