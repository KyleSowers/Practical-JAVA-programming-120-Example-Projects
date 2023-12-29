//PRACTICE 70: A PR0GRAM TO CONVERT FROM STRING TO CHARACTER
package StirngToCharacter;

public class Convert {
    public static void main(String[] args) {

        String helloStr = "This is the original String object";

        char[] StrArray;

        StrArray = helloStr.toCharArray();

        System.out.println("The result of the character array is below: ");
        for (int x = 0; x < StrArray.length; x++) {
            System.out.print(StrArray[x]);
        }
    }
}
