//PRACTICE 14: A PROGRAM FOR INTERFACE
package JavaInterface;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Employee {
    int Reg_no, Rt1, Rt2, Rt3;
    String Name;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void GetInput() throws  Exception {
        System.out.println("Please enter Employee details: Reg_no, Name, Skill Levels of Java, Python, PHP");
        Reg_no = Integer.parseInt(br.readLine());
        Name = br.readLine();
        Rt1 = Integer.parseInt(br.readLine());
        Rt2 = Integer.parseInt(br.readLine());
        Rt3 = Integer.parseInt(br.readLine());
    }
    void display() {
        System.out.println("Your Reg_no is: " + Reg_no);
        System.out.println("Your Name is: " + Name);
        System.out.println("Your Java Skill is: " + Rt1);
        System.out.println("Your Python Skill is: " + Rt2);
        System.out.println(("Your PHP Skill is: " + Rt3));
    }
}

class Output extends Employee {
    int Total;
    float Average;

    void evaluate() throws Exception {
        GetInput();
        Total = Rt1+Rt2+Rt3;
        Average = (float)Total/3;
    }
}
