package Fruits.com.company.fruitpack;

public class Apricot extends Fruit {
    private static int count;
    private static double allWeight;
    private static double allCost;

    public Apricot() {
        super("Абрикос");
        setWeight(0.02 * (Math.random() + 1));
        allWeight += getWeight();
        count++;
    }

    public Apricot(double price) {
        this();
        this.setPrice(price);
        allCost += getCost();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Apricot.count = count;
    }

    public static double getAllWeight() {
        return allWeight;
    }

    public static void setAllWeight(double allWeight) {
        Apricot.allWeight = allWeight;
    }

    public static double getAllCost() {
        return allCost;
    }

    public static void setAllCost(double allCost) {
        Apricot.allCost = allCost;
    }

    @Override
    public double getCost() {
        return getWeight() * this.getPrice();
    }

    @Override
    public String toString() {
        return "Apricot{" +
                "name='" + getName() + "\'" +
                ", weight=" + getWeight() +
                "}";
    }
}
