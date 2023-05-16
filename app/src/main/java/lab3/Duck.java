package lab3;

public abstract class Duck {
    protected QuackStrategy quackS;
    protected FlyStrategy flyS;

    public void quack() {
        quackS.quack();
    }

    public void fly() {
        flyS.fly();
    }

    abstract void display();
    abstract void swim();
}
