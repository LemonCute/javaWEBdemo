package demo2242;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class deteFormat {
    public static void main(String[] args) {
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
      String str =  dateformat.format(new Date());
        System.out.println(str);
    }


}
