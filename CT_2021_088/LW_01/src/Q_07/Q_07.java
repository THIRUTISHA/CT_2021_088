package Q_07;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;

public class Q_07 {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat sdf;
        today = new Date( );
        sdf = new SimpleDateFormat("hh:mm:ss a.");

        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(500,400);
        myWindow.setTitle(sdf.format(today));
        myWindow.setVisible(true);
    }
}


