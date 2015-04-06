package edu.mum.mscs.fpp.project.pos.model;

public class Inventory {

	private int prdId;
	private String prdName;
	private int groupId;
	private int quantity;
	private String DisplayName;
	
	
	public Inventory(int prdId, String prdName, int groupId, int quantity,
			String displayName) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.groupId = groupId;
		this.quantity = quantity;
		DisplayName = displayName;
	}


	public String getDisplayName() {
		return DisplayName;
	}


	public void setDisplayName(String displayName) {
		DisplayName = displayName;
	}


	public int getPrdId() {
		return prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	
}
