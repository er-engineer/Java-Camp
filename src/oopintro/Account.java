package oopintro;

public class Account {
	private int id;
	Owner owner;
	// Simulation: Corporate and Individual Customer have their cards to use it while buying anything.
	
	public Account() {
		// This is an empty constructor method to create instances with default property values.
	}

	public Account(int id, Owner owner) {
		// This is the constructor method which has parameters as the property values.
		this.id = id;
		this.owner = owner;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Owner getOwner() {
		return owner;
	}
	
	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
