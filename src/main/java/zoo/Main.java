package zoo;

public class Main {
    public static void main(String[] args) {
        Carnivore lion = new Lion();
        Herbivore goat = new Goat();
        Herbivore cow = new Cow();
        Grass grass = new Grass();
        lion.eat(goat);
        lion.eat(cow);
        cow.eat(grass);
        goat.eat(grass);
    }
}
