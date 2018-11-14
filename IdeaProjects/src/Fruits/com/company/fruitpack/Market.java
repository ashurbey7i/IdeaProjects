package Fruits.com.company.fruitpack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Market {
    public static void main(String[] args) {
        List<Fruit> fruits = new ArrayList<>();
        for (int i = 0; i < 35; i++) {
            fruits.add(getRandomFruit());
        }
        printInfo(fruits);
    }

    public static void printInfo(List<Fruit> fruits) {
        System.out.println("Было продано:");
        System.out.printf("Яблок - %d шт (%.2f кг), за %.2f грн\n", Apple.getCount(), Apple.getAllWeight(), Apple.getAllCost());
        System.out.printf("Груш - %d шт (%.2f кг), за %.2f грн\n", Pear.getCount(), Pear.getAllWeight(), Pear.getAllCost());
        System.out.printf("Абрикос - %d шт (%.2f кг), за %.2f грн\n", Apricot.getCount(), Apricot.getAllWeight(), Apricot.getAllCost());
        System.out.printf("Итого: %.2f грн", getTotalCost(fruits));
    }

    public static double getTotalCost(List<Fruit> fruits) {
        double total = 0.0;
        for (Fruit fruit : fruits) {
            total += fruit.getCost();
        }
        return total;
    }

    public static Fruit getRandomFruit() {
        switch (new Random().nextInt(3)) {
            case 0:
                return new Apple(15);
            case 1:
                return new Pear(30);
            default:
                return new Apricot(50);
        }
    }

}
