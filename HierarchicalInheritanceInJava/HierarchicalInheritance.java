//PRACTICE 113: A PROGRAM TO DEMONSTRATE HIERARCHICAL INHERITANCE
package HierarchicalInheritanceInJava;
//create new class
class LevelA {
    //create method for level
    public void showA() {
        //output display message for level
        System.out.println("This is level A");
    }
}
//create new class that inherits first class
class LevelB extends LevelA {
    //create new method for level
    public void showB() {
        //output display message for level
        System.out.println("This is level B");
    }
}
//create new class that inherits first class
class LevelC extends LevelA {
    //create new method for level
    public void showC() {
        //output message for level
        System.out.println("This is level C");
    }
}
//create new class that inherits the first class
class LevelD extends LevelA{
    //create new method for level
    public void showD() {
        //output message for level
        System.out.println("This is level D");
    }
}

public class HierarchicalInheritance {
    //main method
    public static void main(String[] args) {
        //new object to call methods
        LevelB lb = new LevelB();
        lb.showA();
        lb.showB();
        //new object to call methods

        LevelC lc = new LevelC();
        lc.showC();
        //lc.showA();
        //new object to call methods

        LevelD ld = new LevelD();
        ld.showD();
        //ld.showA();
    }
}
