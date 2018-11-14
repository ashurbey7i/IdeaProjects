package clothes;

public class Trousers extends Clothes implements MaleClothes, FemaleClothes{
    public Trousers(ClotheSize size, String color) {
        super(size, color);
    }

    public Trousers(ClotheSize size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Штаны{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}