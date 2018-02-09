package loh.dto;

public class Item {
	
	private int itemId = 0;
	private String itemName ="";
	private float itemPrice = 0;
	private String itemCode;
	

	public String getItemCode() {
		return itemCode;
	}


	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}


	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public float getItemPrice() {
		return itemPrice;
	}


	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}


	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemCode="
				+ itemCode + "]";
	}

}
