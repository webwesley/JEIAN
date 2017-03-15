package chap2;

public class MailAddress {
	String name, street, address, city, state;
	int zip;
	
	public MailAddress(String name, String street, String address, String city, String state, int zip) {
		this.name = name;
		this.street = street;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public String toString() {
		//some random shit
	}
}
