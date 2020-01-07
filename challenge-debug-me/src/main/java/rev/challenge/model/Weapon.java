package rev.challenge.model;

import rev.challenge.Driver;

public class Weapon {
	private String name;
	private int damage;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	private Weapon(String name, int damage) {
		super();
		this.name = name;
		this.damage = damage;
	}
	private Weapon() {
		name="pokeball";
		damage=5;
	}
	
	public static Weapon makeWeapon() {
		System.out.println("Choose your Pokemon: type in Charmander, Squirtle, or Bulbasaur");
		//Driver.scan.nextLine();
		switch(Driver.scan.next()) {
		case "Charmander":
			return new Weapon("Charizard", 50);
		case "Squirtle":
			return new Weapon("Squirtle", 50);
		case "Bulbasaur":
			return new Weapon("Bulbasaur", 50);
		//default:
			//return new Weapon();
		}
		return null;
	}
	
}
