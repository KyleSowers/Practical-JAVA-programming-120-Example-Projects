//PRACTICE 112: A PROGRAM TO DEMONSTRATE MULTILEVEL INHERITANCE
package MultilevelInheritanceInJava;

class LevelA {
    public void showA() {
        System.out.println("This level belongs to A");
    }
}

class LevelB extends LevelA {

    public void showB() {
        System.out.println("This level belongs to B");
    }
}

class LevelC extends LevelB {

    public void showC() {
        System.out.println("This level belongs to C");
    }
}

public class MultilevelInheritance {

    public static void main(String[] args) {

        LevelC lc = new LevelC();
    }
}
