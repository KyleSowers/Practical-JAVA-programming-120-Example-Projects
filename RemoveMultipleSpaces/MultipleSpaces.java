// PRACTICE 95: A PROGRAM TO REMOVE MULTIPLE SPACES IN A STRING
package RemoveMultipleSpaces;

import java.util.StringTokenizer;

public class MultipleSpaces {
    public static void main(String[] args) {
        //create string attribute with value having too many spaces
        String Str1 = "Hello    World   and Today    is java";
        //tokenizer identifies spaces of Str1 and created attribute Str2
        StringTokenizer Str2 = new StringTokenizer(Str1, " ");
        //Buffer is mutable unlike String, creating new attribute
        StringBuffer Str3 = new StringBuffer();
        //check for element through loop conditional
        while(Str2.hasMoreElements()) {
            //add elements to Str3 from Str2, add spaces after
            Str3.append(Str2.nextElement()).append(" ");
        }
        //print new Str3 and trim out the spaces
        System.out.println(Str3.toString().trim());
    }
}
