package lesson8;

public class Bouquet {
    private Flower[] flowers;

    public Bouquet(Flower... flowers) {
        this.flowers = flowers;
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public double getBouquetCost() {
        double cost = 0.0;
        for (Flower flower : flowers) {
            cost += flower.getCost();
        }
        return cost;
    }

}