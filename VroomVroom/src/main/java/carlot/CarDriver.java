package carlot;

public class CarDriver {

	public static void main(String[] args) {
		CarBuilder cb = CarBuilder.newInstance();
		cb.setMake("Toyota");
		cb.setModel("Rav4");
		cb.setLicensePlate("ABC123");
		Car c = cb.build();
		System.out.println(c);

		Car c0 = CarBuilder.newInstance().setMake("Ford").setModel("Silverado").setLicensePlate("DEF777").build();
		Car c1 = CarBuilder.newInstance().setMake("Audi").setModel("Q3").setLicensePlate("GHI420").build();
		Car c2 = CarBuilder.newInstance().setMake("Honda").setModel("Civic").setLicensePlate("JKL897").build();
		Car c3 = CarBuilder.newInstance().setMake("Toyota").setModel("Camry").setLicensePlate("MNO434").build();
		
	}

	
	
	
}
