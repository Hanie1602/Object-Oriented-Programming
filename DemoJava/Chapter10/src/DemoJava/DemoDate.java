
package DemoJava;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {
    public static void main(String[] args) {
        Date current = new Date();
        System.out.println("Today: " + current);
        SimpleDateFormat sfomat = new SimpleDateFormat ("dd/MM/yyyy");
        String today = sfomat.format(current);
        System.out.println("Today After Processing: " + today);
    }
}
