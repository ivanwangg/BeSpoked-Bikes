public class Discount {
	private Products product;
	private String beginDate;
	private String endDate;
	private double discountPercentage;
	/**
     * Constructor that sets the appropriate instance variables to their values.
     * @param p the inputted product
     * @param b the inputted begin date
     * @param e the inputted end date
     * @param d the inputted discount percentage
     */
	public Discount(Products p, String b, String e, double d) {
		product = p;
		if (b.equals("") || b == null) {
			beginDate = "Unknown";
		} else {
			beginDate = b;
		}
		if (e.equals("") || e == null) {
			endDate = "Unknown";
		} else {
			endDate = e;
		}
		if (d < 0.0 || d > 100.0) {
			discountPercentage = 0.0;
		} else {
			discountPercentage = d;
		}
		String temp = beginDate;
		String temp1 = endDate;
        temp = temp.replaceAll("[^0-9]", "");
        temp1 = temp1.replaceAll("[^0-9]", "");
		if (temp.substring(4).equals("2022") && temp.substring(0, 2).equals("11") && Integer.parseInt(temp.substring(2, 4)) <= 6
				&& Integer.parseInt(temp1.substring(2, 4)) >= 6) {
			product.setPurchasePrice(product.getPurchasePrice() * (1 - (discountPercentage / 100)));
		}
	}
	/**
     * Default constructor that sets the appropriate instance variables to their values.
     */
	public Discount() {
		this(null, "N/A", "N/A", 0.0);
	}
	/**
     * Copy constructor that sets the appropriate instance variables to their values.
     */
	public Discount(Discount d) {
		product = d.getProduct();
		beginDate = d.getBeginDate();
		endDate = d.getEndDate();
		discountPercentage = d.getDiscountPercentage();
	}
	/**
     * toString method that returns the begin date, end date, product name, and discount percentage of the discount.
     * @return String of the discount information
     */
	public String toString() {
		return "There is a discount from " + beginDate + " to " + endDate + " on " + product.getName() + " of %" + String.format("%.2f", discountPercentage);
	}
	/**
     * method that gets the product.
     * @return the product
     */
	public Products getProduct() {
		return product;
	}
	/**
     * method that gets the begin date.
     * @return the begin date
     */
	public String getBeginDate() {
		return beginDate;
	}
	/**
     * method that gets the end date.
     * @return the end date
     */
	public String getEndDate() {
		return endDate;
	}
	/**
     * method that gets the discount percentage.
     * @return the discount percentage
     */
	public double getDiscountPercentage() {
		return discountPercentage;
	}
	/**
     * method that sets the product.
     * @param s inputted product
     */
	public void setProduct(Products s) {
		product = s;
	}
	/**
     * method that sets the begin date.
     * @param s inputted begin date
     */
	public void setBeginDate(String s) {
		if (!(s.equals("")) && s != null) {
			beginDate = s;
		}
	}
	/**
     * method that sets the end date.
     * @param s inputted end date
     */
	public void setEndDate(String s) {
		if (!(s.equals("")) && s != null) {
			endDate = s;
		}
	}
	/**
     * method that sets the discount percentage.
     * @param s inputted discount percentage
     */
	public void setDiscountPercentage(double s) {
		if (s >= 0.0 && s <= 100.0) {
			discountPercentage = s;
		}
	}
}