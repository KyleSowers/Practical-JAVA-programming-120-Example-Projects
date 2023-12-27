package helloWorld;

import java.text.SimpleDateFormat;
import java.util.Date;

public class currentdate {
    public static void main(String[] args) {

        Date dTime = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("E");
        SimpleDateFormat sdf3 = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat sdf4 = new SimpleDateFormat("MMM");

    }
}
