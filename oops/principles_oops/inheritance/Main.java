package principles_oops.inheritance;

class Animal {
	String name;
	int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void makeSound() {
		System.out.println("some generic animal sound");
	}
}

class Dog extends Animal {
	String breed;

	public Dog(String name, int age, String breed) {
		super(name, age);
		this.breed = breed;
	}

	@Override
	public void makeSound() {
		System.out.println("Woof!! woof!!");
	}

	public void fetchBall() {
		System.out.println(name + " is fetching ball.");
	}
}

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Buddy", 0, "Golden Retriever");
		System.out.println(dog.name);
		System.out.println(dog.age);
		System.out.println(dog.breed);
		;
		dog.makeSound();
		dog.fetchBall();
	}
}
