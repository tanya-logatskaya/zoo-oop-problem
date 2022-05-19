package zoo;

public class Lion extends Carnivore {
    @Override
    void eat(Herbivore herbivore) {
        System.out.println("Lion eats " + herbivore.getClass().getSimpleName());
    }
}
