package clothes;


public class Skirt extends Clothes implements FemaleClothes {
    public Skirt(ClotheSize size, String color) {
        super(size, color);
    }

    public Skirt(ClotheSize size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Юбка{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}