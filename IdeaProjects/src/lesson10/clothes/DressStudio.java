package clothes;

public class DressStudio {
    public void dressMale(Clothes[] clothes) {
        System.out.println("Мужская одежда (в наличии):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof MaleClothes) {
                System.out.println(clothe);
            }
        }
    }

    public void dressFemale(Clothes[] clothes) {
        System.out.println("Женская одежда (в наличии):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof FemaleClothes) {
                System.out.println(clothe);
            }
        }
    }
}
