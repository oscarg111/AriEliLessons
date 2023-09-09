package AriEliLessons.AriEliLesson;

import AriEliLessons.AriEliLesson.Car;
/*
If you are working on a java project, it is convention to have different classes in different files.
 */
public class LessonFive {
    public static void main(String[] args){
        Car nissan = new Car("combustion", 120.1);
        System.out.println(nissan.toString());

        RaceCar lamborghini = new RaceCar("combustion", 250, 5);
        System.out.println(lamborghini.toString());

        Pig pig = new Pig();
        Dog dog = new Dog();
        pig.animalSound();
        dog.animalSound();
    }
}

// final keyword means we can not inherit from this class
final class RaceCar extends Car{
    public RaceCar(String powerType, double topSpeed, int testVar) {
        super(powerType, topSpeed);
        // this will print in addition to the print statement
        // in the car class
        System.out.println("Made a new race car");
    }
}

abstract class Animal {
    public abstract void animalSound();
}

class Pig extends Animal {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}
