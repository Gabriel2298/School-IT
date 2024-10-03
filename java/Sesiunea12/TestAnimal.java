package Sesiunea12;

public class TestAnimal {
    public static void main(String... args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.Cats();
        dog.Dogs();
    }
}
//      Create an abstract class 'Animal' with two abstract methods 'cats' and 'dogs'.
//      Now create a class 'Cat' with a method 'cats' which prints "Cats meow" and a class 'Dog' with a method
//      'dogs' which prints "Dogs bark", both inheriting the class 'Animal'.
//      Now create an object for each of the subclasses and call their respective methods.

abstract class Animal{
    abstract void Cats();
    abstract void Dogs();
}
class Cat extends Animal{

    @Override
    void Cats() {
        System.out.println("Cats meow!!!");
    }

    @Override
    void Dogs() {
    }
}
class Dog extends Animal{

    @Override
    void Cats() {
    }

    @Override
    void Dogs() {
        System.out.println("Dogs bark!!!");
    }
}