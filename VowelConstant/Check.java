package VowelConstant;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Check {
    public static void main(String args[]) {
        char c = ' ';
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please insert a character: ");
        try {
            c = (char)br.read();
        } catch (Exception e) {

        }
    }
}
