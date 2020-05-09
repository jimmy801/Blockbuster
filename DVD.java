
public class DVD {
	private String name;
	private int price;
	private int limitDays;
	private int overDue;
	private double points;

	public DVD() {
		name = "";
		price = 0;
		points = 0;
		limitDays = 0;
		overDue = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String s) {
		this.name = s;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getOverDue() {
		return overDue;
	}

	public void setOverDue(int overDue) {
		this.overDue = overDue;
	}

	public int getLimitDays() {
		return limitDays;
	}

	public void setLimitDays(int limitDays) {
		this.limitDays = limitDays;
	}

	public void setPoints(double points) {
		this.points = points;
	}

	public double getPoints() {
		return points;
	}
}
