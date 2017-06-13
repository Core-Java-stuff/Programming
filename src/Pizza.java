public class Pizza {
	private String catagory;
	private int qty;
	private double amount;

	public Pizza() {

	}

	public Pizza(String catagory, int qty, double amount) {
		super();
		this.catagory = catagory;
		this.qty = qty;
		this.amount = amount;
	}

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Pizza [catagory=" + catagory + ", qty=" + qty + ", amount="
				+ amount + "]";
	}

}
