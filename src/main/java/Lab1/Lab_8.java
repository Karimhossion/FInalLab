/*
Problem Statement : Suppose there are two classes: Animal, Tiger. 
The Animal class two nethods greeting() and makeSound().
The Tiger class inherit from the Animal class the two nethods. 
Tiger class also have its unique method nared bite(). Now,
Write a java program create override Tiger class that will inherit Animal class.*/
package Lab1;

/**
 *
 * @author Arafat
 */
abstract class Animal {
    public abstract void greeting();
    public abstract void makeSound();
}
class Tiger extends Animal {
    public void greeting() {
        System.out.println("Tiger");
    }
    public void makeSound() {
        System.out.println("tiger sound");
    }
    public void bite() {
        System.out.println("tiger bite");
    }
}

public class Lab_8 {
        public static void main(String[] args) {
        Tiger t=new Tiger();
        t.greeting();
        t.makeSound();
        t.bite();
    }
}
