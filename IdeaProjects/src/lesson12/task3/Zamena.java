package lesson12.task3;

public class Zamena {
    public static void main(String[] args) {
        String s = "object oriented programming";

        s = s.replaceAll("object oriented programming", "OOP");
        System.out.println(s);
    }
}
