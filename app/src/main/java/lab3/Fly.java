package lab3;

public class Fly implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("*Volando*");
    }
}
