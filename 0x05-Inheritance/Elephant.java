public class Elephant extends Animal {
    public Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    public String makeSound() {
        return "Trumpet";
    }
}
