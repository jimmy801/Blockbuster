
public class Main {
	public static void main(String[] args) {
		Database db = new Database();

		Customer April = new Customer("April");
		Customer Joe = new Customer("Joe");

		DVD d1 = new OldDVD("神力女超人");
		DVD d2 = new NewDVD("正義聯盟");
		DVD d3 = new NewDVD("雷神索爾3");

		db.addRecord(April, d1, 3);
		db.addRecord(Joe, d1, 2);
		db.addRecord(April, d2, 5);
		db.addRecord(Joe, d3, 1);

		db.printStatement(April);
		db.printStatement(Joe);
	}
}
