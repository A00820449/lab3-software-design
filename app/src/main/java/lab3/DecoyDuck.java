package lab3;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyS = new NoFly();
        quackS = new NoQuack();
    }

    @Override
    void display() {
        System.out.println("*Imagen de un pato falso*");
    }

    @Override
    void swim() {
        System.out.println("No puedo nadar...");
    }
}
