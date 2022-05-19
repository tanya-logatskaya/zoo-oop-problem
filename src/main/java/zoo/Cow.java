package zoo;

public class Cow extends Herbivore {
    @Override
    void eat(Grass grass) {
        System.out.println("Cow eats grass");
    }
}
