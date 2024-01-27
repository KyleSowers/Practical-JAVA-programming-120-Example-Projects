//PRACTICE 118: A PROGRAM TO PRINT OUT ALPHABETS A-Z USING MULTITHREADING
package PrintAlphabets;
//new class extends Thread and has the run method that prints alphabet A-Z
class CharacterAZ extends Thread {
    //method
    public void run() {
        //declare character attribute
        char x;
        //loop will filter through alphabet based on the starting value and the condition
        for (x = 'A'; x <= 'Z'; x++) {
            //print to user each loop interation adding to the output
            System.out.println(" " + x);
        }
    }
}

public class Alphabets {
    //main method
    public static void main(String[] args) {
        //create a new CharacterAZ instance/object of
        CharacterAZ chaz = new CharacterAZ();
        //use instance/object of to utilize the start method to run the run() method and get result
        chaz.start();
    }
}
