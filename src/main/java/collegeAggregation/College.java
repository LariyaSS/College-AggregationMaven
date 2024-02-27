package collegeAggregation;

public class College {

	private String studname;
	private String course;
	private Address address;

	public void setStudName(String studname) {
		this.studname = studname;
	}

	public String getStudname() {
		return studname;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getCourse() {
		return course;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public static void main(String[] args) {
		College c = new College();
		c.setStudName("Riya");
		c.setCourse("MCA");

		Address a = new Address();
		a.setHouseName("Thriveni");
		a.setStreetName("Tvm");
		a.setPincode(123456);
		c.setAddress(a);
		System.out.println("Student Name   is  :" + c.getStudname());
		System.out.println("Student Course is  :" + c.getCourse());
		System.out.println("House name      is :" + c.getAddress().getHouseName());
		System.out.println("Street anme     is :" + c.getAddress().getStreetName());
		System.out.println(" Pincode is        :" + c.getAddress().getPincode());

	}

}
