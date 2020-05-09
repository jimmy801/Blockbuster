
public class ChildrenDVD extends DVD {
	public ChildrenDVD(String s) {
		this.setName(s);
		this.setPrice(2);
		this.setPoints(0.5);
		this.setLimitDays(5);
		this.setOverDue(1);
	}
}
