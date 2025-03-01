package Q_06;
import javax.swing.*;
import java.util.*;

public class Q_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Obtaining information from the user
        // W for Width
        // H for Height
        int W ,H ;
        String title;
        System.out.println("Enter the title of the window :");
        title = scanner.nextLine();
        System.out.println("Enter the width :");
        W = scanner.nextInt();
        System.out.println("Enter the height :");
        H = scanner.nextInt();

        //window
        JFrame myWindow;
        myWindow = new JFrame();
        myWindow.setSize(W,H);
        myWindow.setTitle(title);
        myWindow.setVisible(true);
    }
}


