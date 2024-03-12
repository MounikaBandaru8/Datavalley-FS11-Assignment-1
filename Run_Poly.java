class Animal {
    String makeSound() {
        return "Animal makes a sound";
    }
}

class Dog extends Animal {
    String makeSound() {
        return "Bow Bow";
    }
}

class Cat extends Animal {
    String makeSound() {
        return "meow meow";
    }
}

public class Run_Poly{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        System.out.println(animal.makeSound());
        System.out.println(dog.makeSound());
        System.out.println(cat.makeSound());
    }
}
