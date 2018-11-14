package Fruits.com.company.fruitpack;

public abstract class Fruit {
    private double weight;
    private double price;
    private String name;

    public Fruit(String name) {
        this.name = name;
    }

    public Fruit() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    final void printManufacturerInfo() {
        System.out.print("Made in Ukraine");
    }

    public abstract double getCost();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fruit)) return false;

        Fruit fruit = (Fruit) o;

        if (Double.compare(fruit.weight, weight) != 0) return false;
        return name.equals(fruit.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name.hashCode();
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
