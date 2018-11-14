package clothes;

public interface MaleClothes {
    default void dressMale() {
        System.out.println("Одеваем мужчину");
    }
}
