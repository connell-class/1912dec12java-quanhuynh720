package carlot;

public class SampleCarLot {

	 Car c0 = new Car("Ford", "Silverado", "DEF777");
	 Car c1 = new Car("Audi", "Q3", "GHI420");
	 Car c2 = new Car("Honda", "Civic", "JKL897");
	 Car c3 = new Car("Toyota", "Camry", "MNO434");
	
	 Customer cu0 = new Customer("Batman", "Bruce", "Offer0");
	 Customer cu1 = new Customer("Robin", "Dick", "Offer1");
	 Customer cu2 = new Customer("Joker", "Aurther", "Offer2");
	 
	 ManageCarLot carlot = new ManageCarLot();
	 carlot.addCar(c0); 
	 
	 
}
