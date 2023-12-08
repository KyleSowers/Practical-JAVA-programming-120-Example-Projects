//PRACTICE 14: A PROGRAM FOR INTERFACE
package JavaInterface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Employee {
    //create instance variables
    int Reg_no, Rt1, Rt2, Rt3;
    String Name;
    //create new buffer reader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //create void method, outputs input request an stores accepted values into instance variables
    void GetInput() throws  Exception {
        System.out.println("Please enter Employee details: Reg_no, Name, Skill Levels of Java, Python, PHP");
        Reg_no = Integer.parseInt(br.readLine());
        Name = br.readLine();
        Rt1 = Integer.parseInt(br.readLine());
        Rt2 = Integer.parseInt(br.readLine());
        Rt3 = Integer.parseInt(br.readLine());
    }
    //create method for output statements for each stored input value
    void display() {
        System.out.println("Your Reg_no is: " + Reg_no);
        System.out.println("Your Name is: " + Name);
        System.out.println("Your Java Skill is: " + Rt1);
        System.out.println("Your Python Skill is: " + Rt2);
        System.out.println(("Your PHP Skill is: " + Rt3));
    }
}

class Output extends Employee {
    //new instance variables for new class
    int Total;
    float Average;
    //new method, where new instance variables will store desired result of previous instance variables through equation
    void evaluate() throws Exception {
        GetInput();
        Total = Rt1+Rt2+Rt3;
        Average = (float)Total/3;
    }
    //method to ouput results to user of new defined values of this classes instance variables
    void screenshow() {
        System.out.println("Overall Rating is: " + Total);
        System.out.println("Your percentage is: " + Average);
    }
}

class Company {
    public static void main(String args[]) throws Exception {
        //create new instance of Output class (new Output object)
        Output ot = new Output();
        //with new Output instance, call upon the three methods that were created for output result
        ot.evaluate();
        ot.screenshow();
        ot.display();
    }
}
