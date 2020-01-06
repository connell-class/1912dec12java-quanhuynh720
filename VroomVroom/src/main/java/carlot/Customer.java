package carlot;

public class Customer {

	private String firstName;
	private String lastName;
	private String offers;
	private double payment;
	
	public Customer(String firstName, String lastName, String offers) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.offers = offers;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getOffers() {
		return offers;
	}
	public void setOffers(String offers) {
		this.offers = offers;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", offers=" + offers + "]";
	}
	
	
}
