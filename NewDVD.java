
public class NewDVD extends DVD {
	public NewDVD(String s) {
		this.setName(s);
		this.setPrice(3);
		this.setPoints(2.0);
		this.setLimitDays(1);
		this.setOverDue(2);
	}
}
