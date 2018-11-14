package lesson8;

public class Demo {
    public static void main(String[] args) {
        Rose[] roses = new Rose[1_000_000];
        for (int i = 0; i < roses.length; i++) {
            roses[i] = new Rose();
        }
        Bouquet bouquet = new Bouquet(roses);
        printInfo(bouquet);

        bouquet = new Bouquet(new Lily(), new Lily(),
                new Lily(), new Aster(), new Aster());
        printInfo(bouquet);

        bouquet = new Bouquet(new Carnation(), new Aster(),
                new Lily(), new Aster(), new Rose());
        printInfo(bouquet);
    }

    private static void printInfo(Bouquet bouquet) {
        System.out.print(bouquet);
        System.out.printf("Стоимость букета: %.1f грн\n\n", bouquet.getBouquetCost());
    }
}