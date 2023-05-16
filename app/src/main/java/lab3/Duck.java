package lab3;

public abstract class Duck {
    QuackStrategy quackS;
    FlyStrategy flyS;

    public void quack() {
        quackS.quack();
    }

    public void fly() {
        flyS.fly();
    }

    abstract void display();
    abstract void swim();
}
