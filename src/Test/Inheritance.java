package Test;/*Welcome to my show !

@author: NgKhanh
Date: 4/16/2022
Time: 2:36 PM

ProjectName: JavaBasic1*/

public class Inheritance {
    abstract public static class Mammal extends Animal {
        public Mammal(String name){
            super(name);
        }

        public abstract void greets();

        @Override
        public String toString() {
            return "Mammal{" +
                    "name='" + super.getName() + '\'' +
                    '}';
        }
    }

    public static class Cat extends Mammal {
        public Cat(String name){
            super(name);
        }

        @Override
        public void greets(){
            System.out.println("Meow");
        }

        @Override
        public String getName(){
            return super.getName();
        }

        @Override
        public String toString() {
            return "Cat{" +
                    "name='" + super.getName() + '\'' +
                    '}';
        }
    }

    public static class Dog extends Mammal {
        public Dog(String name){
            super(name);
        }

        @Override
        public void greets(){
            System.out.println("Woof");
        }

        public void greets(Dog another){
            System.out.println("Wooof");
        }

        @Override
        public String getName(){
            return super.getName();
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + super.getName() + '\'' +
                    '}';
        }
    }

    public static class Animal {
        private String name;
        public Animal(String name){
            this.name = name;
        }

        public String getName(){
            return name;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    public static class TestMammal {
        public static void main(String[] args) {
            Mammal m1 = new Cat("Kien4");
            System.out.println(m1);
            m1.greets();

            Mammal m2 = new Dog("Kien5");
            System.out.println(m2);
            m2.greets();

            Mammal m3 = new Dog("Kien6");
            System.out.println(m3);
        }
    }

    public static class TestAnimal {
        public static void main(String[] args) {
            Animal a4 = new Cat("Kien1");
            System.out.println(a4);

            Animal a2 = new Dog("Kien2");
            System.out.println(a2);

            Animal a3 = new Animal("Kien3");
            System.out.println(a3);
        }
    }
}
