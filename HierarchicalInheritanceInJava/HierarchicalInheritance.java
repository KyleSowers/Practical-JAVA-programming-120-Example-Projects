//PRACTICE 113: A PROGRAM TO DEMONSTRATE HIERARCHICAL INHERITANCE
package HierarchicalInheritanceInJava;

class LevelA {
    public void showA() {
        System.out.println("This is level A");
    }
}

class LevelB extends LevelA {

    public void showB() {
        System.out.println("This is level B");
    }
}

class LevelC extends LevelB {

}

public class HierarchicalInheritance {

}
