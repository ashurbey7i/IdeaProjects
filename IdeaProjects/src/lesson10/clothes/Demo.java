package clothes;

public class Demo {
        public static void main(String[] args) {
            Clothes[] clothes = {
                    new Tshirt(ClotheSize.XS, "темно-серый", 350),
                    new Tshirt(ClotheSize.L, "черный", 250),
                    new Trousers(ClotheSize.M, "голубой", 500),
                    new Trousers(ClotheSize.XXS, "синий", 225),
                    new Skirt(ClotheSize.S, "розовый", 400),
                    new Skirt(ClotheSize.M, "красный", 520),
                    new Tie(ClotheSize.L, "синий", 300),
                    new Tie(ClotheSize.L, "красный", 280),
            };

            DressStudio studio = new DressStudio();
            studio.dressMale(clothes);
            System.out.println();
            studio.dressFemale(clothes);
        }
}
