package online.shop;

import java.util.Iterator;
import java.util.List;

public class CategoryDemo {
    public static void main(String[] args) {
        Category car = new Category("HDD");
        fillCategory(car);
        System.out.println("Отсортировано в прямом порядке по имени:");
        printProducts(car.sortByName());
        System.out.println("Отсортировано в обратном порядке по имени:");
        printProducts(car.reverseSortByName());
        System.out.println("Отсортировано в прямом порядке по цене:");
        printProducts(car.sortByPrice());
        System.out.println("Отсортировано в обратном порядке по цене:");
        printProducts(car.reverseSortByPrice());
        System.out.println("Отсортировано в прямом порядке по рейтингу:");
        printProducts(car.sortByRating());
        System.out.println("Отсортировано в обратном порядке по рейтингу:");
        printProducts(car.reverseSortByRating());
        System.out.println("Отсортировано в прямом порядке по объёму двигателя:");
        printProducts(car.sortByEngine());
        System.out.println("Отсортировано в обратном порядке по объёму двигателя:");
        printProducts(car.reverseSortByEngine());
        System.out.println("Отсортировано в прямом порядке по пробегу:");
        printProducts(car.sortByMileage());
        System.out.println("Отсортировано в обратном порядке по пробегу:");
        printProducts(car.reverseSortByMileage());
        System.out.println("Отсортировано в прямом порядке по году производства:");
        printProducts(car.sortByYear());
        System.out.println("Отсортировано в обратном порядке по году производства:");
        printProducts(car.reverseSortByYear());
    }

    public static void fillCategory(Category category) {
        category.addProduct(new Product("Mercedes-Benz CLS 63 AMG", 2013, 0, 6300, 65000, 95));
        category.addProduct(new Product("Ford Mustang EcoBoost", 2015, 0, 2300, 25000, 90));
        category.addProduct(new Product("TOYOTA CAMRY SE", 2018, 0, 2500, 35000, 97));
        category.addProduct(new Product("HYUNDAI Elantra", 2018, 0, 1600, 30000, 80));
        category.addProduct(new Product("Ferrari 458 Italia", 2018, 0, 4500, 320000, 99));
    }


    public static void printProducts(List<Product> productList) {
        Iterator<Product> iterator = productList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
