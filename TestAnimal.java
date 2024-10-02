/*Utilize an abstract class named Animal, featuring abstract methods sound() and move(), 
to design concrete subclasses such as Dog, Cat, and Bird that inherit from Animal 
and implement the necessary methods?*/
package Assignment_02;

abstract class Animal {
	abstract public void sound();

	abstract public void move();
}

class Dog extends Animal {

	public void sound() {
		System.out.println("Dog is barking");
	}

	public void move() {
		System.out.println("Rund Fast..");
	}
}

class Cat extends Animal {

	public void sound() {
		System.out.println("Meow...");
	}

	public void move() {
		System.out.println("Drink Milk..");
	}
}

class Bird extends Animal {

	public void sound() {
		System.out.println("Chiu..chiu...");
	}

	public void move() {
		System.out.println("Fly in the Sky..");
	}
}

public class TestAnimal {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.sound();
		dog.move();
		System.out.println("-------------------------------------");
		Cat cat = new Cat();
		cat.sound();
		cat.move();
		System.out.println("--------------------------------------");
		Bird bird = new Bird();
		bird.sound();
		bird.move();
	}

}
//@Grs