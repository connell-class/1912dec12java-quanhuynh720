package carlot;

import java.io.Serializable;

public class Car implements Serializable {


	private static final long serialVersionUID = 1L;
	private String licensePlate;
	private String make;
	private String model;
	
	public Car() {
		super();
	}
	
	public Car(String licensePlate, String make, String model) {
		super();
		this.licensePlate = licensePlate;
		this.make = make;
		this.model = model;
	}
	
	public String getLicensePlate() {
		return licensePlate;
	}
	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "LP: " + getLicensePlate() + ", Make: " + getMake() + ", " + "Model: " + getModel();
	}
	
	
}
