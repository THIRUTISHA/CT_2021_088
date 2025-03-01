package Q_13;
import javax.swing.*;

public class SampleWindow {
        public static void main(String[] args) {
            JFrame myWindow;
            myWindow = new JFrame();
            myWindow.setSize(500, 250);
            myWindow.setTitle("UOK");
            myWindow.setVisible(true);
            try {Thread.sleep(500);} catch(Exception e) { }
            myWindow.setVisible(false);
            try {Thread.sleep(500);} catch(Exception e) { }
            myWindow.setVisible(true);
        }
    }

