package classes;

public class Animal {
    String name;
    Position position;

    public Animal(String name, Position position) {
        this.name = name;
        this.position = position;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position position() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", position=" + position +
                '}';
    }
}
