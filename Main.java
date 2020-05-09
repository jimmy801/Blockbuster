
public class Main {
	public static void main(String[] args) {
		Database db = new Database();

		Customer April = new Customer("April");
		Customer Joe = new Customer("Joe");

		DVD d1 = new OldDVD("���O�k�W�H");
		DVD d2 = new NewDVD("���q�p��");
		DVD d3 = new NewDVD("�p������3");

		db.addRecord(April, d1, 3);
		db.addRecord(Joe, d1, 2);
		db.addRecord(April, d2, 5);
		db.addRecord(Joe, d3, 1);

		db.printStatement(April);
		db.printStatement(Joe);
	}
}
