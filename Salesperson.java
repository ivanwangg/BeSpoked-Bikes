public class Salesperson {
	private String firstName;
	private String lastName;
	private String address;
	private String phone;
	private String startDate;
	private String terminationDate;
	private String manager;
	private double commission;
	/**
     * Constructor that sets the appropriate instance variables to their values.
     * @param f the inputted first name
     * @param l the inputted last name
     * @param a the inputted address
     * @param p the inputted phone
     * @param sd the inputted start date
     * @param td the inputted termination date
     * @param m the inputted manager
     */
	public Salesperson(String f, String l, String a, String p, String sd, String td, String m) {
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
		if (td.equals("") || td == null) {
			terminationDate = "Unknown";
		} else {
			terminationDate = td;
		}
		if (m.equals("") || m == null) {
			manager = "Unknown";
		} else {
			manager = m;
		}
		commission = 0.0;
	}
	/**
     * Default constructor that sets the appropriate instance variables to their values.
     */
	public Salesperson() {
		this("Unknown", "Unknown", "Unknown", "Unknown", "Unknown", "Unknown", "Unknown");
	}
	/**
     * Copy constructor that sets the appropriate instance variables to their values.
     */
	public Salesperson(Salesperson s) {
		this(s.getFirstName(), s.getLastName(), s.getAddress(), s.getPhone(), s.getStartDate(), s.getTerminationDate(), s.getManager());
	}
	/**
     * toString method that returns the first name, last name, address, phone, start date, termination date, and manager of the salesperson
     * @return String of the salesperson information
     */
	public String toString() {
		return "Name: " + firstName + " " + lastName + "\n  Address: " + address + "\n  Phone: "
			+ phone + "\n  Start Date: " + startDate + "\n  Termination Date: " + terminationDate + "\n  Manager: " + manager;
	}
	/**
     * method that compares if a salesperson is equal to another.
     * @param o the inputted object
     * @return boolean of if the inputted object is equal to the object
     */
	public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Salesperson)) {
            return false;
        }
        Salesperson s1 = (Salesperson) o;
        return getFirstName().equalsIgnoreCase(s1.getFirstName()) && getLastName().equalsIgnoreCase(s1.getLastName())
            && getAddress().equalsIgnoreCase(s1.getAddress()) && getPhone().equalsIgnoreCase(s1.getPhone())
            && getStartDate().equalsIgnoreCase(s1.getStartDate()) && getTerminationDate().equalsIgnoreCase(s1.getTerminationDate())
            && getManager().equalsIgnoreCase(s1.getManager());
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
     * method that gets the termination date.
     * @return the termination date
     */
	public String getTerminationDate() {
		return terminationDate;
	}
	/**
     * method that gets the manager.
     * @return the manager
     */
	public String getManager() {
		return manager;
	}
	/**
     * method that gets the commission.
     * @return the commission
     */
	public double getCommission() {
		return commission;
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
	/**
     * method that sets the termination date.
     * @param s inputted termination date
     */
	public void setTerminationDate(String s) {
		if (!(s.equals("")) && s != null) {
			terminationDate = s;
		}
	}
	/**
     * method that sets the manager.
     * @param s inputted manager
     */
	public void setManager(String s) {
		if (!(s.equals("")) && s != null) {
			manager = s;
		}
	}
	/**
     * method that sets the commission.
     * @param s inputted commission
     */
	public void setCommission(double s) {
		if (s >= 0.0) {
			commission = s;
		}
	}
}