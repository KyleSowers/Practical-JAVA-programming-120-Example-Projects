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

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        addvalue = new JTextField();
        addvalue.setFont(new Font("Tahoma", Font.BOLD, 25))
    }
}
