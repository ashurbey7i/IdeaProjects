package lesson8;

public abstract class Flower {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getCost();

    @Override
    public String toString() {
        return "lesson8.Flower{" +
                "name='" + name + '\'' +
                '}';
    }
}
