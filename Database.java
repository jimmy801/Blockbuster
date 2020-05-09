import java.util.Vector;

public class Database {
	private static Vector<Record> records;

	public Database() {
		this.records = new Vector<>();
	}

	public void addRecord(Customer c, DVD dvd, int borrowDays) {
		records.add(new Record(c, dvd, borrowDays));
	}

	public void printStatement(Customer c) {
		int cost = 0;
		System.out.println("===============================================");
		for (Record r : records) {
			if (r.getCustomer().equals(c)) {
				cost += r.getBorrowPrice();
				System.out.printf("%s rent %s for %d days, which cost $%d\n", r.getCustomer().getName(),
						r.getDVD().getName(), r.getBorrowDays(), r.getBorrowPrice());
			}
		}
		System.out.println("-----------------------------------------------");
		System.out.printf("Total cost of %s is $%d\n", c.getName(), cost);
		System.out.printf("Total points of %s is %.1f points\n", c.getName(), c.getPoints());
		System.out.println("===============================================");
	}
}
