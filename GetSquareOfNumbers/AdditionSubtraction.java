//PRACTICE 123: A SWING PROGRAM FOR ADDITION AND SUBTRACTION
package GetSquareOfNumbers;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
        addvalue.setFont(new Font("Tahoma", Font.BOLD, 25));
        addvalue.setBounds(72,41,153,64);
        frame.getContentPane().add(addvalue);
        addvalue.setColumns(10);

        subvalue = new JTextField();
        subvalue.setFont(new Font("Tahoma", Font.BOLD, 25));
        subvalue.setColumns(10);
        subvalue.setBounds(467, 41, 153, 64);
        frame.getContentPane().add(subvalue);

        JButton btnAdd = new JButton("ADD");
        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

                int num1,num2,ans;
                try {
                    num1 = Integer.parseInt(addvalue.getText());

                    num2 = Integer.parseInt(subvalue.getText());

                    ans = num1 + num2;

                    txtDisplay.setText(Integer.toString(ans));
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Only Valid/Integer numbers are accepted");
                }
            }
        });
        btnAdd.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnAdd.setBounds(223,171,108, 51);
        frame.getContentPane().add(btnAdd);

        JButton btnSub = new JButton("SUB");
        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int num1,num2,ans;
                try {
                    num1 = Integer.parseInt(addvalue.getText());

                    num2 = Integer.parseInt(subvalue.getText());

                    ans = num1 - num2;

                    txtDisplay.setText(Integer.toString(ans));
                } catch (Exception e2) {
                    JOptionPane.showMessageDialog(null, "Only Valid/Integer numbers are accepted");
                }
            }
        });
        btnSub.setFont(new Font("Tahoma", Font.BOLD, 15));
        btnSub.setBounds(329, 171, 108, 51);
        frame.getContentPane().add(btnSub);

        txtDisplay = new JTextField();
        txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 25));
        txtDisplay.setBounds(136, 251, 401, 64);
        frame.getContentPane().add(txtDisplay);
        txtDisplay.setColumns(10);
    }
}
