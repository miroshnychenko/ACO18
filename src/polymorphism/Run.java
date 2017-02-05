package polymorphism;

/**
 * Created by serhiim on 05-Feb-17.
 */
public class Run {
    public static void main(String[] args) {
        Animal animal_1 = new Cat();
        Animal animal_2 = new Dog();
        Animal animal_3 = new Duck();

        animal_1.speak();
        animal_2.speak();
        animal_3.speak();
    }
}
