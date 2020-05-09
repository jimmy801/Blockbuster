
public class Customer {
	private String name;
	private double points;

	public Customer(String name) {
		this.name = name;
		points = 0d;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getPoints() {
		return points;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public void addPoints(double points) {
		this.points += points;
	}

}
