/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */
public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public boolean isPolite() {
        return false;
    }
}