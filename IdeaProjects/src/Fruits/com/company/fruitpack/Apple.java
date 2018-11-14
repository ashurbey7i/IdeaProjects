package Fruits.com.company.fruitpack;

public class Apple extends Fruit {
    private static int count;
    private static double allWeight;
    private static double allCost;

    public Apple() {
        super("Яблоко");
        setWeight(0.1 * (Math.random() + 1));
        allWeight += getWeight();
        count++;
    }

    public Apple(double price) {
        this();
        this.setPrice(price);
        allCost += getCost();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Apple.count = count;
    }

    public static double getAllWeight() {
        return allWeight;
    }

    public static void setAllWeight(double allWeight) {
        Apple.allWeight = allWeight;
    }

    public static double getAllCost() {
        return allCost;
    }

    public static void setAllCost(double allCost) {
        Apple.allCost = allCost;
    }

    @Override
    public double getCost() {
        return getWeight() * this.getPrice();
    }

    @Override
    public String toString() {
        return "Apple{" +
                "name='" + getName() + "\'" +
                ", weight=" + getWeight() +
                "}";
    }
}
