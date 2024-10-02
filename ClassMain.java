/* Suppose a class 'A' has a static method to print "Parent".
Its subclass 'B' also has a static method with the same name to print "Child".
Now call this method by the objects of the two classes. Also, call this method by an object of the parent class referring to the child class
i.e. A obj=new B()*/
package Assignment_02;

class A {
   static void print() {
        System.out.println("Parent");
    }
}

class B extends A {
    static void print() {
        System.out.println("Child");
    }
}

public class ClassMain {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		System.out.println("--------------print using A obj-------------------");
		a.print();
		System.out.println("--------------print using B obj-------------------");
		b.print();
		System.out.println("--------------print obj of A class using B reference -------------------");
		A ab =new B();
		ab.print();

	}
}
//@GRS