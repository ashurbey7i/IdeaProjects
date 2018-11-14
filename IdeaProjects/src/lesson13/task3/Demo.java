package lesson13.task3;

import lesson12.task7.Employee;

import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.Locale;

public class Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Employee[] employees = {
                new Employee("Иванов Иван Иванович", 3500, new Date()),
                new Employee("Петров Петр Петрович", 4000, new Date()),
                new Employee("Сидоров Сидор Сидорович", 4150, new Date())
        };

        FullReport.generateFullReport(Locale.ROOT, employees);
        FullReport.generateFullReport(new Locale("en", "US"), employees);
        FullReport.generateFullReport(new Locale("ru", "RU"), employees);
    }
}
