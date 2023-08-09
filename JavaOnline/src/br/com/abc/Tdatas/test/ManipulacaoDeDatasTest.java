package br.com.abc.Tdatas.test;

import java.util.Calendar;
import java.util.Date;

public class ManipulacaoDeDatasTest {
    public static void main(String[] args){
        Date date = new Date();
        date.setTime(date.getTime()+ 3_600_000L);
        System.out.println(date);

        Calendar c = Calendar.getInstance();
        c.setTime(date);
        if (Calendar.SUNDAY == c.getFirstDayOfWeek()){
            System.out.println("Domingo");
        }
        System.out.println(c);
    }
}
