//PRACTICE 119: A PROGRAM TO PRINT OUT ALPHABET USING ALTERNATE
package PrintAlphabetAlternate;

class LowerAZ extends Thread{

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

    public static void main(String[] args) {

        LowerAZ laz = new LowerAZ();
        laz.start();
    }
}
