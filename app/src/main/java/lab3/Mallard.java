package lab3;

public class Mallard extends Duck {
    public Mallard() {
        flyS = new Fly();
        quackS = new Quack();
    }

    @Override
    void display() {
        System.out.println("*Imagén de pato de collar*");
    }

    @Override
    void swim() {
        System.out.println("*Pato de collar nadando*");
    }
}
