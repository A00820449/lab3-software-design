package lab3;

public class RedHead extends Duck {
    public RedHead() {
        flyS = new Fly();
        quackS = new Quack();
    }

    @Override
    void display() {
        System.out.println("*Imagén de pato de cabeza roja*");
    }

    @Override
    void swim() {
        System.out.println("*Pato de cabeza roja nadando...*");
    }
}
