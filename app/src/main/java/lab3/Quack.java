package lab3;

public class Quack implements QuackStrategy {
    @Override
    public void quack() {
        System.out.println("Cua!");
    }
}
