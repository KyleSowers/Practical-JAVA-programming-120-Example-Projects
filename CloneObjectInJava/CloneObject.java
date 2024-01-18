//PRACTICE 107: A PROGRAM TO CLONE OBJECTS
package CloneObjectInJava;

public class CloneObject implements Cloneable{
    //create attributes
    String name;
    int record;
    //constructor for attributes
    public CloneObject(String name, int record) {
        this.name = name;
        this.record = record;
    }
    //method to show result
    public void show() {
        System.out.println("Welcome " + name + "! Your score is: " + record);
    }

    public static void main(String[] args) {
        //create new object
        CloneObject co = new CloneObject("David", 98);
        //try-catch to attempt to clone or catch clone not supported exception
        try {
            CloneObject co1 = (CloneObject)co.clone();
            co1.show();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
