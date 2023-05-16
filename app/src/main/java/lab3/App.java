package lab3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        Duck d = null;

        System.out.println("Elige un pato:");
        System.out.println("1 Pato de collar");
        System.out.println("2 Pato de cabeza roja");
        System.out.println("3 Pato falso");
        System.out.println("4 Patito de hule");

        Integer ans = s.nextInt();
        s.close();

        if (ans == 1) {
            d = new Mallard();
        }
        else if (ans == 2) {
            d = new RedHead();
        }
        else if (ans == 3) {
            d = new DecoyDuck();
        }
        else if (ans == 4) {
            d = new RubberDuck();
        }
        else {
            throw new Exception("Opcion invalida");
        }

        System.out.println("Imágen del pato:");
        d.display();
        System.out.println("Pato graznando:");
        d.quack();
        System.out.println("Pato volando:");
        d.fly();
        System.out.println("Pato nadando:");
        d.swim();

    }
}
