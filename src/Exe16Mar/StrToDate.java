package Exe16Mar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
How to convert string to date in java
program
 */
public class StrToDate {
    public static void main(String[] args) throws ParseException {
StrToDate obj = new StrToDate();
        obj.date(Utils.Utils.scanner().next());
    }
    public void date (String data1) throws ParseException {
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        Date date = format1.parse(data1);
        System.out.println(date);
    }
}
