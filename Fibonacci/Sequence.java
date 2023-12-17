package Fibonacci;

public class Sequence {
    public static void main(String args[]) {
        //declare instance variables
        int w = 0, x = 1, y, z, count =10;
        //print statement for string portion of result statement
        System.out.println("The result of the Fibonacci Sequence is: ");
        //initial result of value variables printed
        System.out.print(w + " " + x);
        //filter through sequence with equation and variable value resetting to get fibonocci result
        for (z = 2; z < count; z++) {
            y = w + x;
            //print each new fibonacci result
            System.out.print(" " + y);
            w = x;
            x = y;
        }
    }
}
