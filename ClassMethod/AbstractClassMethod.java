package ClassMethod;

//create an abstract class for calculate
abstract class calculate {
    //declare instance variables for base and height
    double base, height;
    //create constructor for calculate with attributes
    calculate (double x, double y) {
        base = x;
        height = y;
    }
    //create abstract method, where bodies will be created by subclasses
    abstract  double area();
}

//create new class that inherits calculate
class Rectangle extends calculate {
    //class inherits attributes
    Rectangle(double x, double y) {
        //inherits constructor calculate
        super(x, y);
    }
    //call the area method and create body/return
    double area() {
        return base * height;
    }
}

//create new class that also inherits calculate
class Triangle extends calculate {
    //inherits attributes from calculate
    Triangle(double x, double y) {
        //inherit constructor calculate
        super (x, y);
    }
    //call abstract area method and create body/return
    double area() {
        return base * height / 2;
    }
}

public class AbstractClassMethod {
    public static void main(String args[]) {
        //create new triangle and rectangle objects with parameters
        Triangle tr = new Triangle(10, 45);
        Rectangle rt = new Rectangle(15, 25);
        //use polymorphism to reference calculate and assign triangle object
        calculate cal;
        cal = tr;
        //print triangle result of area method through cal variable
        System.out.println("The area of Triangle is: " + cal.area());
        //use cal variable to assign rectangle object
        cal = rt;
        //print rectangle result of area method through cal variable
        System.out.println("The area of a Rectangle is: " + cal.area());
    }
}
