//PRACTICE 111: A PROGRAM TO DEMONSTRATE SINGLE INHERITANCE
package SingleInheritanceInJava;

class Area {
    int height;
    int width;
}
public class GetRectangle extends Area {

    int area;

    public void TotalArea() {
        area = width * height;
    }

    public static void main(String[] args) {

        GetRectangle gr = new GetRectangle();

        gr.width = 25;
        gr.height = 13;
    }
}


