/* Create an immutable class called Person with final fields for name and age.
Provide a constructor to initialize these fields, and make sure that once the object is created, 
the values cannot be changed.*/
package Assignment_02;

final class Person {
	final int age;
	final String name;

	Person() {
		age = 22;
		name = "Girish";
	}

	public String toString() {
		return "person [age=" + age + ", name=" + name + "]";
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public int setAge(int age) {
		return age;
	}

	public String setName(String name) {
		return name;
	}

}

public class TestPerson {

	public static void main(String[] args) {
		Person person = new Person();
		Person person1 = new Person();
		System.out.println("-------------------Person 1------------------");
		System.out.println(person);
		System.out.println("-------------------Person 2------------------");
		person1.setAge(45);
		System.out.println(person1);

	}

}
//@GRS