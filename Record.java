
public class Record {
	private Customer customer;
	private DVD dvd;
	private int borrowDays;
	private int borrowPrice;

	public Record(Customer customer, DVD dvd, int borrowDays) {
		this.customer = customer;
		this.dvd = dvd;
		this.borrowDays = borrowDays;
		this.borrowPrice = dvd.getPrice() + Math.max(borrowDays - dvd.getLimitDays(), 0) * dvd.getOverDue();

		customer.addPoints(dvd.getPoints());
	}

	public Customer getCustomer() {
		return customer;
	}

	public DVD getDVD() {
		return dvd;
	}

	public int getBorrowDays() {
		return borrowDays;
	}

	public int getBorrowPrice() {
		return borrowPrice;
	}
}
