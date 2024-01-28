//PRACTICE 119: A PROGRAM TO PRINT OUT ALPHABET USING ALTERNATE
package PrintAlphabetAlternate;

class LowerAZ extends Thread{
    //create a public void class for desired method execution
    public void run() {
        int x = 97;
        while (x <= 122) {
            try {
                x = x + 2;
                System.out.println(" " + (char)x);
            } catch ( Exception e) {

            }
        }
    }
}

public class AlphabetAZ {
    //main method
    public static void main(String[] args) {
        //new instance/object of created class with method
        LowerAZ laz = new LowerAZ();
        //use object to call method through start() method due to extended Thread on class above
        laz.start();
    }
}
