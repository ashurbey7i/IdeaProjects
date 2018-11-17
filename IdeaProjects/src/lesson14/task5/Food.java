package lesson14.task5;

public class Food {
    public void prepare(Cookable c) {
        c.cook();
    }

    public static void main(String[] args) {
        Food food = new Food();
        food.prepare(Cookable.cookable);
    }
}
