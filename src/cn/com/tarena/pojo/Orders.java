package cn.com.tarena.pojo;

public class Orders {

	private int orderid;
	private String name;
	private float cost;
	private String userid;
	private int statusid;
	private int paywayid;

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getStatusid() {
		return statusid;
	}

	public void setStatusid(int statusid) {
		this.statusid = statusid;
	}

	public int getPaywayid() {
		return paywayid;
	}

	public void setPaywayid(int paywayid) {
		this.paywayid = paywayid;
	}

}
