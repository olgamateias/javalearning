package eLibrary;

public class Author {
	private String firstName;
	private String lastName;

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return firstName + ", " + lastName;
	}

}