package demo2242;

import java.util.Calendar;

public class calender {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println(calendar);
    }
}
