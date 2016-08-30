package seedu.addressbook.data.person;
/*
 *  The Postal Code of the Person's address in the address book
 */
public class PostalCode{
	private String postalCode;
	
	public PostalCode(String postalCode){
		this.postalCode = postalCode;
	}
	
	public String getPostalCode(){
		return this.postalCode;
	}
}