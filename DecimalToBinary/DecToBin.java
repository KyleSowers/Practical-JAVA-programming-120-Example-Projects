//PRACTICE 67: PROGRAM TO CONVERT FROM DECIMAL TO BINARY
package DecimalToBinary;

public class DecToBin {
    public void Convert(int num1) {
        int bin[] = new int[40];
        int ind = 0;

        while (num1 > 0) {
            bin[ind++] = num1 % 2;
            num1 = num1 / 2;
        }
        for (int x = ind - 1; x >= 0; x--) {
            System.out.println(bin[x]);
        }
    }

    public static void  main(String[] args) {
        DecToBin dtb = new DecToBin();
    }
}
