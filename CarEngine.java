package Assignment_02;

class Engine {
    private String engineName;
    private int engineNumber;

    public Engine(String engineName, int engineNumber) {
        this.engineName = engineName;
        this.engineNumber = engineNumber;
    }

    public void displayEngine() {
        System.out.println("Name of Engine : " + engineName);
        System.out.println("Number of Engine : " + engineNumber);
    }
}

class Car extends Engine {
    private String carName;
    private String color;

    public Car(String engineName, int engineNumber, String carName, String color) {
        super(engineName, engineNumber);
        this.carName = carName;
        this.color = color;
    }

    public void displayCar() {
        System.out.println("Car name : " + carName);
        System.out.println("Color : " + color);
    }

    public void startCar() {
        System.out.println("Car Started");
    }

    public void stopCar() { 
        System.out.println("Car Stopped");
    }
}

public class CarEngine {

	public static void main(String[] args) {
		
		 Engine engine = new Engine("Electric", 555);
	        engine.displayEngine();
	 
	        System.out.println("------------------------------");

	        Car car = new Car("Flat",2856, "Audi", "Black");
	        car.displayCar();
	        System.out.println("-------------------------------");
	        car.startCar();
	        car.stopCar(); 
		

	}

}
