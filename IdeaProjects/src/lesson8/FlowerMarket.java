package lesson8;

public class FlowerMarket {
    public enum Flowers {
        ROSE("Роза", 40), ASTER("Астра", 15), LILY("Лилия", 30), CARNATION("Гвоздика", 15);

        Flowers(String name, double price) {
            this.name = name;
            this.price = price;
        }

        private final double price;
        private final String name;

        public double getPrice() {
            return price;
        }

        public String getName() {
            return name;
        }
    }

    public Flower getFlower(Flowers flower) {
        switch (flower) {
            case ROSE:
                return new Rose();
            case ASTER:
                return new Aster();
            case LILY:
                return new Lily();
            case CARNATION:
                return new Carnation();
            default: return null;
        }
    }

    public Bouquet getBouquet(Flowers... flowers) {
        Flower[] flower = new Flower[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            flower[i] = getFlower(flowers[i]);
        }
        return new Bouquet(flower);
    }
}