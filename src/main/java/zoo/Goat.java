package zoo;

public class Goat extends Herbivore {
    @Override
    void eat(Grass grass) {
        System.out.println("Goat eats grass");
    }
}
