//PRACTICE 16: A PROGRAM TO USE THIS KEYWORD
package ThisKeyword;

public class UseThis {
    //created instance variables
    int num1, num2;
    //created constructor, intakes two int values, stroes in instance variables
    UseThis(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    //created method to produce string output with use of variables
    void show() {
        System.out.println("Value of Num1 is: " + num1);
        System.out.println("value of Num2 is: " + num2);
    }

    public static void main(String args[]) {
        //created new instance (object) of UseThis, with two int values
        UseThis ut = new UseThis(100, 200);
        //called on show method for output into console
        ut.show();
    }
}


