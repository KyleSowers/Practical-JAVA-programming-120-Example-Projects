//PRACTICE 123: A SWING PROGRAM FOR ADDITION AND SUBTRACTION
package GetSquareOfNumbers;

import javax.swing.*;
import java.awt.*;

public class AdditionSubtraction {

    private JFrame frame;
    private JTextField addvalue;
    private JTextField subvalue;
    private JTextField txtDisplay;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AdditionSubtraction window = new AdditionSubtraction();

                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public AdditionSubtraction() {
        initialize();
    }
}
