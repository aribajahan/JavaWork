//Encapsulation

package applicationhw;

public class Buyer {
	
	private String buyerSS;
	private String buyerName;
	private int computerSKU;
	private String password;
	
	
	
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyerSS() {
		return buyerSS;
	}
	public void setBuyerSS(String buyerSS) {
		this.buyerSS = buyerSS;
	}
	public int getComputerSKU() {
		return computerSKU;
	}
	public void setComputerSKU(int computerSKU) {
		this.computerSKU = computerSKU;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
