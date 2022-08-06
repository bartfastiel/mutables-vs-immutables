package record;

public record Animal(
        String name,
        Position position) {

    public Animal withPosition(Position position) {
        return new Animal(name(), position);
    }
}
