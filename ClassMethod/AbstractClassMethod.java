package ClassMethod;

abstract class calculate {
    double base, height;
    calculate (double x, double y) {
        base = x;
        height = y;
    }
    abstract  double area();
}

class Rectangle extends calculate {

}

public class AbstractClassMethod {
    public static void main(String args[]) {

    }
}
