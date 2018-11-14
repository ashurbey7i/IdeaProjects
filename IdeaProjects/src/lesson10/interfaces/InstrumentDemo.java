package interfaces;

public class InstrumentDemo {
    public static void main(String[] args) {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guitar();
        instruments[1] = new Baraban();
        instruments[2] = new Truba();

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
