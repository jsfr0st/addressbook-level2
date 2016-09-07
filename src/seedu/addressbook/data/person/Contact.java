package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public abstract class Contact {
	
	public final String value;
	private boolean isPrivate;
	
	public Contact(String contact, boolean isPrivate, String validationRegex, String messageConstraints) throws IllegalValueException {
		this.value = contact;
		this.isPrivate = isPrivate;
		if(!isValidContact(contact, validationRegex)) {
				throw new IllegalValueException(messageConstraints);
		}
	}
	
	public static boolean isValidContact(String test, String validationRegex) {
		return test.matches(validationRegex);
	}
	
	public String toString() {
		return value;
	}
	
	public int hashCode() {
		return value.hashCode();
	}
	
	public boolean isPrivate() {
		return isPrivate;
	}
}