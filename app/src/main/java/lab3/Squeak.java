package lab3;

public class Squeak implements QuackStrategy {
    @Override
    public void quack() {
        System.out.println("*Chillido*");
    }
}
