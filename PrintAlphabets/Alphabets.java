//PRACTICE 118: A PROGRAM TO PRINT OUT ALPHABETS A-Z USING MULTITHREADING
package PrintAlphabets;

class CharacterAZ extends Thread {

    public void run() {
        char x;
        for (x = 'A'; x <= 'Z'; x++) {
            System.out.println(" " + x);
        }
    }
}

public class Alphabets {

    public static void main(String[] args) {

        CharacterAZ chaz = new CharacterAZ();
        chaz.start();
    }
}
