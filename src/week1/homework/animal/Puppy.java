package week1.homework.animal;

/**
 * Created by serhiim on 23-Jan-17.
 */
public class Puppy extends Dog{
    @Override
    public void jump() {
        System.out.println("Puppy is jumping");
    }

    @Override
    public void ran() {
        System.out.println("Puppy is running");
    }

    @Override
    public void bite() {
        System.out.println("Puppy is biting");
    }

    @Override
    public void voice() {
        System.out.println("Puppy Wof wof");
    }

    @Override
    public void printName() {
        super.printName();
    }

    public static void main(String[] args) {
        Animal puppy = new Puppy();
        puppy.name = "Puppy";

        puppy.jump();
    }

}
