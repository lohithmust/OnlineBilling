package loh.dto;

public class Cashier {

	private int cashierId;
	private String cashierName="";
	private int cashierLevel;
	private double cashierContactNumber;
	private float cashierSalary;
	private String cashiermail_id;
	private String cUsername;
	private String cPassword;

	
	
	public String getCashiermail_id() {
		return cashiermail_id;
	}
	public void setCashiermail_id(String cashiermail_id) {
		this.cashiermail_id = cashiermail_id;
	}
	public int getCashierId() {
		return cashierId;
	}
	public String getcUsername() {
		return cUsername;
	}
	public void setcUsername(String cUsername) {
		this.cUsername = cUsername;
	}
	public String getcPassword() {
		return cPassword;
	}
	public void setcPassword(String cPassword) {
		this.cPassword = cPassword;
	}
	public double getCashierContactNumber() {
		return cashierContactNumber;
	}
	public void setCashierContactNumber(double cashierContactNumber) {
		this.cashierContactNumber = cashierContactNumber;
	}
	public void setCashierId(int cashierId) {
		this.cashierId = cashierId;
	}
	public String getCashierName() {
		return cashierName;
	}
	public void setCashierName(String cashierName) {
		this.cashierName = cashierName;
	}
	public int getCashierLevel() {
		return cashierLevel;
	}
	public void setCashierLevel(int cashierLevel) {
		this.cashierLevel = cashierLevel;
	}
	public float getCashierSalary() {
		return cashierSalary;
	}
	public void setCashierSalary(float cashierSalary) {
		this.cashierSalary = cashierSalary;
	}
	@Override
	public String toString() {
		return "Cashier [cashierId=" + cashierId + ", cashierName=" + cashierName + ", cashierLevel=" + cashierLevel
				+ ", cashierContactNumber=" + cashierContactNumber + ", cashierSalary=" + cashierSalary
				+ ", cashiermail_id=" + cashiermail_id + ", cUsername=" + cUsername + ", cPassword=" + cPassword + "]";
	}
	
	
	
	
	
}
