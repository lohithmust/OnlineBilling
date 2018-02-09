package loh.dto;

public class Company {

	private int companyId;
	private String companyName;
	private String companyOwner;
	private String mail;
	private double contactNumber;
	private String username="";
	private String password;
	//private String itemCompany;
	//private String idcashier;
	
	public Company() {
		
		
	}

	public Company(int companyId,String companyName, String companyOwner, String mail, int contactNumber, String username, String password) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyOwner = companyOwner;
		this.mail = mail;
		this.contactNumber = contactNumber;
		this.username = username;
		this.password = password;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyOwner() {
		return companyOwner;
	}

	public void setCompanyOwner(String companyOwner) {
		this.companyOwner = companyOwner;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public double getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(double contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", companyOwner=" + companyOwner
				+ ", mail=" + mail + ", contactNumber=" + contactNumber + ", password=" + password+", username="+username + "]";
	}
	
	
}
