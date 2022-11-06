public class Products {
	private String name;
	private String manufacturer;
	private String style;
	private double purchasePrice;
	private double salePrice;
	private int qtyOnHand;
	private double commissionPercentage;
	/**
     * Constructor that sets the appropriate instance variables to their values.
     * @param n the inputted name
     * @param m the inputted manufacturer
     * @param s the inputted style
     * @param p the inputted purchasePrice
     * @param sp the inputted salePrice
     * @param q the inputted qtyOnHand
     * @param c the inputted commissionPercentage
     */
	public Products(String n, String m, String s, double p, double sp, int q, double c) {
		if (n.equals("") || n == null) {
			name = "Unknown";
		} else {
			name = n;
		}
		if (m.equals("") || m == null) {
			manufacturer = "Unknown";
		} else {
			manufacturer = m;
		}
		if (s.equals("") || s == null) {
			style = "Unknown";
		} else {
			style = s;
		}
		if (p < 0.0) {
			purchasePrice = 0.0;
		} else {
			purchasePrice = p;
		}
		if (sp < 0.0) {
			salePrice = 0.0;
		} else {
			salePrice = sp;
		}
		if (q < 0) {
			qtyOnHand = 0;
		} else {
			qtyOnHand = q;
		}
		if (c < 0.0) {
			commissionPercentage = 0.0;
		} else {
			commissionPercentage = c;
		}
	}
	/**
     * Default constructor that sets the appropriate instance variables to their values.
     */
	public Products() {
		this("Unknown", "Unknown", "Unknown", 0, 0, 0, 0.0);
	}
	/**
     * Copy constructor that sets the appropriate instance variables to their values.
     */
	public Products(Products p) {
		this(p.getName(), p.getManufacturer(), p.getStyle(), p.getPurchasePrice(), p.getSalePrice(), p.getQtyOnHand(), p.getCommissionPercentage());
	}
	/**
     * toString method that returns the name, manufacturer, style, purchase price, sale price, qty on hand, and commission percentage of the product
     * @return String of the products information
     */
	public String toString() {
		return "Name: " + name + "\n  Manufacturer: " + manufacturer + "\n  Style: " + style + "\n  Purchase Price: $" + String.format("%.2f", purchasePrice)
			+ "\n  Sale Price: $" + String.format("%.2f", salePrice) + "\n  Qty On Hand: " + qtyOnHand + "\n  Commission Percentage: %" + String.format("%.2f", commissionPercentage);
	}
	/**
     * method that compares if a product is equal to another.
     * @param o the inputted object
     * @return boolean of if the inputted object is equal to the object
     */
	public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof Products)) {
            return false;
        }
        Products p1 = (Products) o;
        return getName().equalsIgnoreCase(p1.getName()) && getManufacturer().equalsIgnoreCase(p1.getManufacturer())
            && getStyle().equalsIgnoreCase(p1.getStyle()) && getPurchasePrice() == p1.getPurchasePrice()
            && getSalePrice() == p1.getSalePrice() && getQtyOnHand() == p1.getQtyOnHand()
            && getCommissionPercentage() == p1.getCommissionPercentage();
    }
    /**
     * method that gets the name.
     * @return the name
     */
	public String getName() {
		return name;
	}
	/**
     * method that gets the manufacturer.
     * @return the manufacturer
     */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
     * method that gets the style.
     * @return the style
     */
	public String getStyle() {
		return style;
	}
	/**
     * method that gets the purchase price.
     * @return the purchase price
     */
	public double getPurchasePrice() {
		return purchasePrice;
	}
	/**
     * method that gets the sale price.
     * @return the sale price
     */
	public double getSalePrice() {
		return salePrice;
	}
	/**
     * method that gets the qty on hand.
     * @return the qty on hand
     */
	public int getQtyOnHand() {
		return qtyOnHand;
	}
	/**
     * method that gets the commission percentage.
     * @return the commission percentage
     */
	public double getCommissionPercentage() {
		return commissionPercentage;
	}
	/**
     * method that sets the name.
     * @param s inputted name
     */
	public void setName(String s) {
		if (!(s.equals("")) && s != null) {
			name = s;
		}
	}
	/**
     * method that sets the manufacturer.
     * @param s inputted manufacturer
     */
	public void setManufacturer(String s) {
		if (!(s.equals("")) && s != null) {
			manufacturer = s;
		}
	}
	/**
     * method that sets the style.
     * @param s inputted style
     */
	public void setStyle(String s) {
		if (!(s.equals("")) && s != null) {
			style = s;
		}
	}
	/**
     * method that sets the purchase price.
     * @param s inputted purchase price
     */
	public void setPurchasePrice(double s) {
		if (s >= 0.0) {
			purchasePrice = s;
		}
	}
	/**
     * method that sets the sale price.
     * @param s inputted sale price
     */
	public void setSalePrice(double s) {
		if (s >= 0.0) {
			salePrice = s;
		}
	}
	/**
     * method that sets the qty on hand.
     * @param s inputted qty on hand
     */
	public void setQtyOnHand(int s) {
		if (s >= 0) {
			qtyOnHand = s;
		}
	}
	/**
     * method that sets the commission percentage.
     * @param s inputted commission percentage
     */
	public void setCommissionPercentage(double s) {
		if (s >= 0) {
			commissionPercentage = s;
		}
	}
}