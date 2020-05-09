
public class OldDVD extends DVD {
	public OldDVD(String s) {
		this.setName(s);
		this.setPrice(2);
		this.setPoints(1.0);
		this.setLimitDays(3);
		this.setOverDue(1);
	}
}
