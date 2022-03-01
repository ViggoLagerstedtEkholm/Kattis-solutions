package com.company.Easy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Datum {
    public static void main(String[] args) throws ParseException {
        Scanner scan = new Scanner(System.in);
        String day = scan.next();
        String month = scan.next();
        String inputDate = day + "/" + month + "/2009";
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        Date dt1 = format1.parse(inputDate);
        DateFormat format2 = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        String finalDay = format2.format(dt1);
        System.out.println(finalDay);
    }
}
