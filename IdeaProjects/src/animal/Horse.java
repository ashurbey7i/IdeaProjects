public class Horse extends Animal {
    private String weight;

    public Horse(){
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("Лошадь ест.");
    }

    @Override
    public String makeNoise() {
        return "Их-ха-а-ха-ха!!!!";
    }
}
