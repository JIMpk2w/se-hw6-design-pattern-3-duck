/*
 * Name: Pakawat Panklang
 * Student ID: 6510450763
 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class QuackPolite implements Quackable {
    Quackable duck;

    public QuackPolite(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));

        duck.quack();

        System.out.flush();
        System.setOut(originalOut);

        String quackOutput = baos.toString().trim();
        System.out.println(quackOutput + " ka");
    }

    @Override
    public boolean isPolite() {
        return true;
    }
}