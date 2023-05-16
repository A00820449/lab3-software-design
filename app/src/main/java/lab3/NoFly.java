package lab3;

public class NoFly implements FlyStrategy {
    @Override
    public void fly() {
        System.out.println("No puedo volar... :(");
    }
}
