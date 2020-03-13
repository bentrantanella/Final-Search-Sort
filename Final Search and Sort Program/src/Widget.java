
public class Widget implements Comparable<Widget>{
	int productnum;
	int numsold;
	
	public Widget(int p, int n) {
		productnum = p;
		numsold = n;
	}
	
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
		if (getNumsold() > o.getNumsold())
			return -1;
		else if (getNumsold() < o.getNumsold())
			return 1;
		return 0;
	}
	
	public String getInfo() {
		return productnum + ", number sold: " + numsold;
	}
	
	public boolean equals(String s) {
		return Integer.parseInt(s) == numsold;
	}
}
