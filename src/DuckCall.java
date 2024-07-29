/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */
public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("Kwak");
    }

    @Override
    public boolean isPolite() {
        return false;
    }
}