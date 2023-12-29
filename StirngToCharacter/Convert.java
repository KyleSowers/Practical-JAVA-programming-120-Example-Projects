//PRACTICE 70: A PR0GRAM TO CONVERT FROM STRING TO CHARACTER
package StirngToCharacter;

public class Convert {
    public static void main(String[] args) {
        //declare string attribute
        String helloStr = "This is the original String object";
        //declare new char array
        char[] StrArray;
        //add string attribute, separate each word of string into elements in array
        StrArray = helloStr.toCharArray();
        //print result to user, after looping through array for each char element
        System.out.println("The result of the character array is below: ");
        for (int x = 0; x < StrArray.length; x++) {
            System.out.print(StrArray[x]);
        }
    }
}
