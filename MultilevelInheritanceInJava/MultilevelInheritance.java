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

class LevelC {

}

public class MultilevelInheritance {
}
