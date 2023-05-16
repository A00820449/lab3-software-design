package lab3;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyS = new NoFly();
        quackS = new Squeak();
    }

    @Override
    void display() {
        System.out.println("*Imágen de patito de hule*");
    }

    @Override
    void swim() {
        System.out.println("*Patito de hulo flotando*");
    }
}
