package Chapter10;

import ToolKit.myDate;

public class Exercise14 {

    public static void main(String[] args) {
        // Chapter 10 Exercise 14
        myDate date1 = new myDate();
        myDate date2 = new myDate(34355555133101L);

        System.out.println("Date1 - Month: " + date1.getMonth() +
                " Day: " + date1.getDay() + " Year: " + date1.getYear());
        System.out.println("Date2 - Month: " + date2.getMonth() +
                " Day: " + date2.getDay() + " Year: " + date2.getYear());
    }
    
}
