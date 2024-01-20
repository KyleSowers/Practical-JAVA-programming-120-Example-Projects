//PRACTICE 111: A PROGRAM TO DEMONSTRATE SINGLE INHERITANCE
package SingleInheritanceInJava;

//create class for rectangle/area figuring attributes
class Area {
    int height;
    int width;
}
//create class extending Area to provide method for solving for area of rectangle
public class GetRectangle extends Area {
    //attribute that is the value of the area after factoring/solving
    int area;
    //method created and stores area value in area attribute
    public void TotalArea() {
        area = width * height;
    }

    public static void main(String[] args) {
        //create new object
        GetRectangle gr = new GetRectangle();
        //store associated attribute values in object for method
        gr.width = 25;
        gr.height = 13;
        //call upon method to solve for area
        gr.TotalArea();
        //print result to user calling on the area attribute
        System.out.println("The result of the area of your rectangle is: " + gr.area);
    }
}


