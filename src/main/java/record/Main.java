package record;

public class Main {

    public static void main(String[] args) {
        Animal ant = new Animal("Ameise", new Position(5,5));
        Printer.print(ant);

        System.out.println(ant.position().x() + ant.position().y());

        ant = ant.withPosition(new Position(6, 5));
    }
}
