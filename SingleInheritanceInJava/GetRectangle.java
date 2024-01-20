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
}


