/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */
public class MallardDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public boolean isPolite() {
        return false;
    }
}