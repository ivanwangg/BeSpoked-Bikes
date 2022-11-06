public class Customer {
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private String startDate;
	/**
     * Constructor that sets the appropriate instance variables to their values.
     * @param f the inputted first name
     * @param l the inputted last name
     * @param a the inputted address
     * @param p the inputted phone
     * @param sd the inputted start date
     */
	public Customer(String f, String l, String a, String p, String sd) {
		if (f.equals("") || f == null) {
			firstName = "Unknown";
		} else {
			firstName = f;
		}
		if (l.equals("") || l == null) {
			lastName = "Unknown";
		} else {
			lastName = l;
		}
		if (a.equals("") || a == null) {
			address = "Unknown";
		} else {
			address = a;
		}
		if (p.equals("") || p == null) {
			phone = "Unknown";
		} else {
			phone = p;
		}
		if (sd.equals("") || sd == null) {
			startDate = "Unknown";
		} else {
			startDate = sd;
		}
	}
	/**
     * Default constructor that sets the appropriate instance variables to their values.
     */
	public Customer() {
		this("Unknown", "Unknown", "Unknown", "Unknown", "Unknown");
	}
	/**
     * Copy constructor that sets the appropriate instance variables to their values.
     */
	public Customer(Customer c) {
		this(c.getFirstName(), c.getLastName(), c.getAddress(), c.getPhone(), c.getStartDate());
	}
	/**
     * toString method that returns the first name, last name, address, phone, and start date of the Customer
     * @return String of the customer information
     */
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\n  Address: " + address + "\n  Phone: "
			+ phone + "\n  Start Date: " + startDate;
	}
	/**
     * method that gets the first name.
     * @return the first name
     */
	public String getFirstName() {
		return firstName;
	}
	/**
     * method that gets the last name.
     * @return the last name
     */
	public String getLastName() {
		return lastName;
	}
	/**
     * method that gets the address.
     * @return the address
     */
	public String getAddress() {
		return address;
	}
	/**
     * method that gets the phone.
     * @return the phone
     */
	public String getPhone() {
		return phone;
	}
	/**
     * method that gets the start date.
     * @return the start date
     */
	public String getStartDate() {
		return startDate;
	}
	/**
     * method that sets the first name.
     * @param s inputted first name
     */
	public void setFirstName(String s) {
		if (!(s.equals("")) && s != null) {
			firstName = s;
		}
	}
	/**
     * method that sets the last name.
     * @param s inputted last name
     */
	public void setLastName(String s) {
		if (!(s.equals("")) && s != null) {
			lastName = s;
		}
	}
	/**
     * method that sets the address.
     * @param s inputted address
     */
	public void setAddress(String s) {
		if (!(s.equals("")) && s != null) {
			address = s;
		}
	}
	/**
     * method that sets the phone.
     * @param s inputted phone
     */
	public void setPhone(String s) {
		if (!(s.equals("")) && s != null) {
			phone = s;
		}
	}
	/**
     * method that sets the start date.
     * @param s inputted start date
     */
	public void setStartDate(String s) {
		if (!(s.equals("")) && s != null) {
			startDate = s;
		}
	}
}