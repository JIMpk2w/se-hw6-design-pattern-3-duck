/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */
public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public boolean isPolite() {
        return false;
    }
}