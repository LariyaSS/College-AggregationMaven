package collegeAggregation;

public class Address {

	private String housename, streetname;
	private int pincode;

	public void setHouseName(String housename) {
		this.housename = housename;
	}

	public void setStreetName(String streetname) {
		this.streetname = streetname;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getHouseName() {
		return housename;
	}

	public String getStreetName() {
		return streetname;
	}

	public int getPincode() {
		return pincode;
	}

}
