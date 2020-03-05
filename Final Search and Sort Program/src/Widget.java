
public class Widget implements Comparable<Widget>{
	int productnum;
	int numsold;
	
	public int getProductnum() {
		return productnum;
	}
	
	public void setProductnum(int productnum) {
		this.productnum = productnum;
	}
	
	public int getNumsold() {
		return numsold;
	}
	
	public void setNumsold(int numsold) {
		this.numsold = numsold;
	}

	@Override
	public int compareTo(Widget o) {
		return getNumsold() - o.getNumsold();
	}
	
}