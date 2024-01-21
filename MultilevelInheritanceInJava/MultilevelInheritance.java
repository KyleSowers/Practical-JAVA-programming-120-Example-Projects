//PRACTICE 112: A PROGRAM TO DEMONSTRATE MULTILEVEL INHERITANCE
package MultilevelInheritanceInJava;
//create class A
class LevelA {
    //create method to show class level
    public void showA() {
        System.out.println("This level belongs to A");
    }
}
//create class B, inherits class A
class LevelB extends LevelA {
    //create method to show class level
    public void showB() {
        System.out.println("This level belongs to B");
    }
}
//create class C, inherits class B
class LevelC extends LevelB {
    //create method to show class level
    public void showC() {
        System.out.println("This level belongs to C");
    }
}

public class MultilevelInheritance {
    //main method
    public static void main(String[] args) {
        //create instance of class C
        LevelC lc = new LevelC();
        //call methods through level methods, which extend each other for result
        lc.showA();
        lc.showB();
        lc.showC();
    }
}
