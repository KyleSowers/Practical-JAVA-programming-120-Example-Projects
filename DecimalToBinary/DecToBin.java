//PRACTICE 67: PROGRAM TO CONVERT FROM DECIMAL TO BINARY
package DecimalToBinary;

public class DecToBin {
    //class method
    public void Convert(int num1) {
        //declare attributes for method
        //new array that holds 40
        int bin[] = new int[40];
        //new attribute
        int ind = 0;
        //under condition store array indexes with values of remainder of num1 interation values divided by 2
        while (num1 > 0) {
            bin[ind++] = num1 % 2;
            num1 = num1 / 2;
        }
        //for condition read reverse order and print
        for (int x = ind - 1; x >= 0; x--) {
            System.out.println(bin[x]);
        }
    }

    public static void  main(String[] args) {
        //create new object
        DecToBin dtb = new DecToBin();
        //print results using object that calls method uses given argue values
        System.out.println("Binary equivalent of 88 is: ");
        dtb.Convert(88);
        System.out.println("\n Binary equivalent of 55 is: ");
        dtb.Convert(55);
        System.out.println("\n Binary equivalent 0f 10 is: ");
        dtb.Convert(10);
    }
}
