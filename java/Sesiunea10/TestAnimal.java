package Sesiunea10;

//   1.Create an Animal class with sound() method that prints to console “animal makes sounds”
class Animal {
    public void sound() {
        System.out.println("Animal makes sounds!");
    }
}

//  2. Create a Dog class that extends Animal and overrides sound() method; dogs make a particular sound, so we want to print “bark”, in this case

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("bark");
    }
}
//  3. Create a Cat class that extends Animal and overrides sound() method, and in this case, we want to print in our method “meow”

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("meow");
    }
}

//  4. Create a Wolf class that extends Animal, and overrides sound() method, and print “how”

class Wolf extends Animal {
    @Override
    public void sound() {
        System.out.println("how");
    }
}

// 5.Create a TestAnimal Class with a main method, create objects with each animal class created (dog, cat, wolf) and call sound()

class TestAnimal {
    public static void main(String... args) {
        Animal myDog = new Dog();
        myDog.sound();

        Animal myCat = new Cat();
        myCat.sound();

        Animal myWolf = new Wolf();
        myWolf.sound();

    }

}