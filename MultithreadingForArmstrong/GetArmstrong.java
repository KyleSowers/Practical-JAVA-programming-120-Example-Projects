//PRACTICE 116: A PROGRAM TO FIND ARMSTRONG USING MULTITHREADING
package MultithreadingForArmstrong;

public class GetArmstrong {

    public void run() {

        int add = 0, res = 0, x, y;
        for (y = 1; y < 500; y++) {
            x = y;
            add = res = 0;
            while (x > 0) {
                res = x % 10;
                add = add + (res * res * res);
                x = x / 10;
            }
            if (add == y) {
                System.out.println(" " + y);
            }
        }
    }
}

public class CallThread {

}
