/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */
public class PigeonAdapter implements Quackable {
    Pigeon pigeon;

    public PigeonAdapter(Pigeon pigeon) {
        this.pigeon = pigeon;
    }

    @Override
    public void quack() {
        pigeon.coo();
        pigeon.coo();
    }

    @Override
    public boolean isPolite() {
        return false;
    }
}