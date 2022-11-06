public class Sales {
	private Products product;
	private Salesperson salesperson;
	private Customer customer;
	private String salesDate;
	/**
     * Constructor that sets the appropriate instance variables to their values.
     * @param p the inputted product
     * @param s the inputted salesperson
     * @param c the inputted customer
     * @param sd the inputted sales date
     */
	public Sales(Products p, Salesperson s, Customer c, String sd) {
		product = p;
		salesperson = s;
		customer = c;
		if (sd.equals("") || sd == null) {
			salesDate = "Unknown";
		} else {
			salesDate = sd;
		}
		salesperson.setCommission(((product.getCommissionPercentage() / 100) * product.getPurchasePrice()) + salesperson.getCommission());
	}
	/**
     * Default constructor that sets the appropriate instance variables to their values.
     */
	public Sales() {
		this(null, null, null, "Unknown");
	}
	/**
     * Copy constructor that sets the appropriate instance variables to their values.
     */
	public Sales(Sales s) {
		this(s.getProduct(), s.getSalesperson(), s.getCustomer(), s.getSalesDate());
	}
	/**
     * toString method that returns the product name, salesperson name, customer name, price, salesperson comission, and sales date of the sale
     * @return String of the sale information
     */
	public String toString() {
		return "Product sold: " + product.getName() + "\n  Salesperson: " + salesperson.getFirstName() + " " + salesperson.getLastName()
			+ "\n  Customer: " + customer.getFirstName() + " " + customer.getLastName() + "\n  Price: $" + String.format("%.2f", product.getPurchasePrice())
			+ "\n  Salesperson Commisson: $" + String.format("%.2f", (product.getCommissionPercentage() / 100) * product.getPurchasePrice()) + "\n  Date: " + salesDate;
	}
	/**
     * method that gets the product.
     * @return the product
     */
	public Products getProduct() {
		return product;
	}
	/**
     * method that gets the salesperson.
     * @return the salesperson
     */
	public Salesperson getSalesperson() {
		return salesperson;
	}
	/**
     * method that gets the customer.
     * @return the customer
     */
	public Customer getCustomer() {
		return customer;
	}
	/**
     * method that gets the sales date.
     * @return the sales date
     */
	public String getSalesDate() {
		return salesDate;
	}
	/**
     * method that sets the product.
     * @param s inputted product
     */
	public void setProduct(Products s) {
		product = s;
	}
	/**
     * method that sets the salesperson.
     * @param s inputted salesperson
     */
	public void setSalesperson(Salesperson s) {
		salesperson = s;
	}
	/**
     * method that sets the customer.
     * @param s inputted customer
     */
	public void setCustomer(Customer s) {
		customer = s;
	}
	/**
     * method that sets the sales date.
     * @param s inputted sales date
     */
	public void setSalesDate(String s) {
		salesDate = s;
	}
}