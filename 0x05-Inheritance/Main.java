public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 5);
        Tiger tiger = new Tiger("Henry", 3);
        Elephant elephant = new Elephant("Dumbo", 10);

        lion.setAge(4);
        tiger.setAge(7);
        elephant.setAge(18);

        System.out.println(lion.getName() + " is " + lion.getAge() + " years old and says " + lion.makeSound());
        System.out.println(tiger.getName() + " is " + tiger.getAge() + " years old and says " + tiger.makeSound());
        System.out.println(elephant.getName() + " is " + elephant.getAge() + " years old and says " + elephant.makeSound());
    }
}
