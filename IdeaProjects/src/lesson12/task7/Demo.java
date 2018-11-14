package lesson12.task7;

public class Demo {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Макаров Иван Давыдович", 3500),
                new Employee("Петров Петр Петрович", 4000),
                new Employee("Комарова Дарья Сергеевна", 4150),
                new Employee("Дудка Катя Петровна", 3200),
                new Employee("Давыдова Клара Ивановна", 3700),
        };

        Report.generateReport(employees);
    }
}

