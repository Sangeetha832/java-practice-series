package OOPs;

class Vehicle {
	void display() {
		System.out.println("Display the vehicle models...");
	}
}

class Car extends Vehicle {
	void display() {
		System.out.println("Display the Car models..");
	}

	void models() {
		System.out.println("SUV, EV, ..");
	}
}

public class Vehicle_override {
	public static void main(String[] args) {
		Vehicle vehi = new Vehicle();
		vehi.display();
		
		Vehicle car_obj = new Car();
		car_obj.display();
		
		Car car = new Car();
		car.display();
		car.models();
		
	}
}
