package lesson16.task9;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        Map<String, Toy> toyMap = new HashMap<>();
        fillMap(toyMap);
        System.out.println("Используем keySet():");
        MapIt.printByKeySet(toyMap);
        System.out.println("Используем values():");
        MapIt.printByValues(toyMap);
        System.out.println("Используем entrySet():");
        MapIt.printByEntrySet(toyMap);
    }

    public static void fillMap(Map<String, Toy> toyMap) {
        toyMap.put("Monster track", new Toy("Monster track", 250));
        toyMap.put("Teddy bear", new Toy("Teddy bear", 1250));
        toyMap.put("Machine gun", new Toy("Machine gun", 700));
        toyMap.put("Candy", new Toy("Candy", 10));
        toyMap.put("Angry bird", new Toy("Angry bird", 1000));
    }
}
