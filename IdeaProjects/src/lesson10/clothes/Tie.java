package clothes;

public class Tie extends Clothes implements MaleClothes{
    public Tie(ClotheSize size, String color) {
        super(size, color);
    }

    public Tie(ClotheSize size, String color, double cost) {
        super(size, color, cost);
    }

    @Override
    public String toString() {
        return "Галстук{" +
                "размер = " + getSize() +
                ", цена = " + getCost() + " грн" +
                ", цвет = " + getColor() +
                "}";
    }
}
