//PRACTICE 11: A PROGRAM FOR USE OF FINAL KEYWORD AS A METHOD
package FinalKeyword;

public class Keyword {
    //CREATE METHOD "DISPLAY", THAT IS FINAL AND VOIDS RETURN VALUE
    final void display() {
        System.out.println("This is a final Method");
    }
}

class Hello extends Keyword {
    public static void main(String args[]) {
        //CREATE NEW INSTANCE OF HELLO (NEW OBJECT), THAT IS THEN CALLED USING CLASS KEYWORDS DISPLAY METHOD
        Hello h1 = new Hello();
        h1.display();
    }
}


