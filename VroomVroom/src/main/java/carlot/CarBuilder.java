package carlot;

import ui.LoggingIn;

public class CarBuilder {
	
	public void addCar(){
		System.out.println("Please enter the vehicle's license plate");
		String licensePlate = LoggingIn.scan.nextLine();
		System.out.println("Please enter the vehicle's manufacturer");
		String make = LoggingIn.scan.nextLine();
		System.out.println("Please enter the vehicle's model");
		String model = LoggingIn.scan.nextLine();
		setLicensePlate(licensePlate);
		setMake(make);
		setModel(model);
	}
	
	private String licensePlate;
	private String make;
	private String model;
	
	public static CarBuilder newInstance() {
		return new CarBuilder();
	}
	
	private CarBuilder() {}
	
	public CarBuilder setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
		return this;
	}
	
	public CarBuilder setMake(String make) {
		this.make = make;
		return this;
	}
	
	public CarBuilder setModel(String model) {
		this.model = model;
		return this;
	}
	
	public Car build() {
		return new Car(this.licensePlate, this.make, this.model);
	}
	
	
}
