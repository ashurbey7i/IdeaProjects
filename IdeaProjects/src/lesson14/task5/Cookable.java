package lesson14.task5;

public interface Cookable {
    void cook();

    Cookable cookable = new Cookable() {
        @Override
        public void cook() {

        }
    };

}
