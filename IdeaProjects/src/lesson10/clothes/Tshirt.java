package clothes;

public class Tshirt extends Clothes implements MaleClothes, FemaleClothes{
    public Tshirt(ClotheSize size, String color) {
        super(size, color);
    }

    public Tshirt(ClotheSize size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Футболка{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}
