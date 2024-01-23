package helpers;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public class DataHelper {
    public static String monthNow() {
        LocalDate today = LocalDate.now();
        int monthInt = today.getMonthValue();
        String monthNow = Integer.toString(monthInt);
        return monthNow;
    }

    public static String yearNow() {
        LocalDate today = LocalDate.now();
        int yearInt = today.getYear();
        String yearNow = Integer.toString(yearInt);
        return yearNow;
    }

    public static String invalidMonthGenerator() {
        LocalDate today = LocalDate.now();
        Random r = new Random();
        int invalidMonthInt;
        int monthNow = today.getMonthValue();

        if (monthNow == 01) {
            int x = r.nextInt(11) + 1;
            invalidMonthInt = monthNow + x;
        } else {
            int y = r.nextInt(monthNow - 1) + 1;
            ;
            invalidMonthInt = y;

        }
        String invalidMonth = Integer.toString(invalidMonthInt);

        return invalidMonth;
    }

    public static String validMonthGenerator() {
        LocalDate today = LocalDate.now();
        Random r = new Random();
        int validMonthInt;
        int monthNow = today.getMonthValue();

        if (monthNow == 12) {
            validMonthInt = monthNow;
        } else {
            int x = r.nextInt(monthNow + 1);
            ;
            validMonthInt = x;

        }
        String validMonth = Integer.toString(validMonthInt);

        return validMonth;
    }


    public static String invalidYearGenerator() {
        LocalDate today = LocalDate.now();
        int yearInt = today.getYear();
        int invalidYearInt;
        Random r = new Random();
        Random n = new Random();
        Random m = new Random();
        int x = r.nextInt(30) + 1;
        int y = m.nextInt(100) + 1;
        if (x < yearInt) {
            invalidYearInt = n.nextInt(yearInt);
        } else {
            if (y <= 5) {
                invalidYearInt = yearInt + 6;
            } else {
                invalidYearInt = yearInt + y;
            }
        }

        String invalidYear = Integer.toString(invalidYearInt);
        return invalidYear;
    }

    public static String validYearGenerator() {
        LocalDate today = LocalDate.now();
        int yearInt = today.getYear();
        Random r = new Random();

        int validYearInt = yearInt + r.nextInt(5) + 1;
        String validYear = Integer.toString(validYearInt);

        return validYear;
    }

    public static String validNameGenerator(){
        var faker = new Faker(new Locale("en-GB"));
        return faker.name().firstName()+faker.name().lastName();
    }
}
