package carlot;
import java.util.ArrayList;
import offers.*;

public class ManageCarLot extends CarPayment {

	 private ArrayList <Car> cars;
	 private ArrayList <Customer> customers ;
	
	 
	  public ManageCarLot() {
	       customers = new ArrayList<Customer>();
	       cars= new ArrayList<Car>();
	   }
	 
	 public void addCar(Car another) {
	       cars.add(another);
	 }
	
	 public void carSold (Customer cu, Car sCar) {
		 if(cars.contains(sCar)) {
			 double amt = calculateCarPayment();
			 removeCar(sCar); 
		 }
	 }
	 
	 public void removeCar(Car rCar) {
		cars.remove(rCar);
		}
	
}
	 
	 
