package polymorphism;

/**
 * Created by serhiim on 05-Feb-17.
 */
public class Run {
    public static void main(String[] args) {
        // создаем animal_1 типа Аnimal, с ссылкой на Cat
        Animal animal_1 = new Cat();
        // создаем animal_2 типа Аnimal, с ссылкой на Dog
        Animal animal_2 = new Dog();
        // создаем animal_3 типа Аnimal, с ссылкой на Duck
        Animal animal_3 = new Duck();

        // у Аnimal есть свой метод .speak(), который говорит "I don't know how to speak"
        // не смотря на то, чо animal_1 - объект класса Аnimal, он будет мяукать, т.к. ссылается на  Cat
        // animal_1 будет мяукать, т.к. при создании мы указали что этот энимал ссылается на Cat
        animal_1.speak();
        // animal_2 будет гавкать т.к. ссылается на Дог
        animal_2.speak();
        // animal_3 будет крякать, так как ссылается на Duck
        animal_3.speak();
    }
}
