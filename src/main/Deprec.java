package main;
import java.util.Date;

/** Demonstrate deprecation warning */
@Deprecated
public class Deprec {
    public static void main(String[] av) {
// Create a Date object for May 5, 1986
        Date d =
                new Date(86, 04, 05); // EXPECT DEPRECATION WARNING
        System.out.println("Date is " + d);
    }
}