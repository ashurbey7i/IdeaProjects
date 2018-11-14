package Fruits.com.company.fruitpack;

public class Pear extends Fruit {
    private static int count;
    private static double allWeight;
    private static double allCost;

    public Pear() {
        super("Груша");
        setWeight(0.25 * (Math.random() + 1));
        allWeight += getWeight();
        count++;
    }

    public Pear(double price) {
        this();
        this.setPrice(price);
        allCost += getCost();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Pear.count = count;
    }

    public static double getAllWeight() {
        return allWeight;
    }

    public static void setAllWeight(double allWeight) {
        Pear.allWeight = allWeight;
    }

    public static double getAllCost() {
        return allCost;
    }

    public static void setAllCost(double allCost) {
        Pear.allCost = allCost;
    }


    @Override
    public double getCost() {
        return getWeight() * this.getPrice();
    }

    @Override
    public String toString() {
        return "Pear{" +
                "name='" + getName() + "\'" +
                ", weight=" + getWeight() +
                "}";
    }
}
