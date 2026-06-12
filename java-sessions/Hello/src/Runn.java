public class Runn {
    static class Animal{

        String name;

        void sound(){
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal{

        @Override
        void sound(){
            System.out.println("Dog barks");
        }
    }
    static class Cat extends Animal{

        @Override
        void sound(){
            System.out.println("Cat meows");
        }
    }

    static void main() {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
    }
    }
