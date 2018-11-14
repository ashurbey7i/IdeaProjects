public class Dog extends Animal {
    private String name;

    public Dog() {
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Собака ест.");
    }

    @Override
    public String makeNoise() {
        return "Гав-гав-гав!!!";
    }
}