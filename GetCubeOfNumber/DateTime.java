//PRACTICE 124: A SWING PROGRAM TO DISPLAY DATE AND TIME
package GetCubeOfNumber;

import com.sun.jdi.event.EventQueue;

import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateTime {

    private JFrame frame;
    private JLabel lblClock;

    public static void main(String[] args) {


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
                    }
                }
            }
        }
    }
}
