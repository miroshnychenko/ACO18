package week1.homework.animal;

/**
 * Created by serhiim on 23-Jan-17.
 */
public class Dog extends Animal{

    @Override
    public void jump() {
        System.out.println("Dog is jumping");
    }

    @Override
    public void ran() {
        System.out.println("Dog is running");
    }

    @Override
    public void bite() {
        System.out.println("Dog is biting");
    }

    @Override
    public void voice() {
        System.out.println("Wof wof");
    }

    @Override
    public void printName() {
        super.printName();
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.name = "eweq";
        dog.bite();
    }
}


