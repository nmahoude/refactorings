package ide.tools.extractclass;

/**
 * This class has 2 concepts : person & office
 * 
 * extract a class for office data
 *
 * feel free to experiment with delegation (don't change class api)
 * or expose a new Office object
 */

public class ComplicatedPersonClass {
	String name;
	String telephoneNumber;
	
	String officeNumber;
	String officeAdress;
	String officeAreaCode;
	
	
	public String name() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String telephoneNumber() {
		return telephoneNumber;
	}
	public void telephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String officeNumber() {
		return officeNumber;
	}
	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}
	public String officeAdress() {
		return officeAdress;
	}
	public void setOfficeAdress(String officeAdress) {
		this.officeAdress = officeAdress;
	}
	public String officeAreaCode() {
		return officeAreaCode;
	}
	public void setOfficeAreaCode(String officeAreaCode) {
		this.officeAreaCode = officeAreaCode;
	}
	
	
	
}
