package Q_04;
import java.text.SimpleDateFormat;
import java.util.*;

public class Q_04 {
    public static void main(String[] args) {
    Date today;
    SimpleDateFormat sdf;
    today = new Date( );
    sdf = new SimpleDateFormat("dd MMM yyyy.");
    System.out.println(sdf.format(today));
}
 }

