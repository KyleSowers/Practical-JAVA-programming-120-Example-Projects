//PRACTICE 124: A SWING PROGRAM TO DISPLAY DATE AND TIME
package GetCubeOfNumber;

import javax.swing.*;
import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime {

    private JFrame frame;
    private JLabel lblClock;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    DateTime window = new DateTime();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

    }


    public void datetime() {

        Thread datetime = new Thread() {
            public void run() {
                try {
                    for (;;) {
                        Calendar cal = new GregorianCalendar();

                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH);
                        int year = cal.get(Calendar.YEAR);
                        int second = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int hour = cal.get(Calendar.HOUR);

                        lblClock.setText("Time " + hour + ":" + minute + ":" + second + " " + "Date " + year + "/" + month + "/" + day);
                        sleep(1000);
                    }
                } catch (Exception e) {

                }
            }
        };
        datetime.start();
    }

    public DateTime() {
        initialize();
        datetime();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 703, 365);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        lblClock = new JLabel("Clock");
        lblClock.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblClock.setBounds(24, 69, 640, 175);
        frame.getContentPane().add(lblClock);
    }
}
