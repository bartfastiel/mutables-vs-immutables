package classes;

public class Printer {
    public static void print(Animal ant) {
        System.out.println(ant);
        ant.position().x = ant.position().y+1;
    }
}
