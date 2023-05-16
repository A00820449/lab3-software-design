package lab3;

public class NoQuack implements QuackStrategy{
    @Override
    public void quack() {
        System.out.println("*Silencio*");
    }
}
