package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;

public class NameTest {
    
    private Name name;
    
    @Before
    public void setup() {
        try {
            name = new Name("John Smith");
        } catch (IllegalValueException e) {
            assertTrue(false);
        }
    }

    @Test
    public void null_isSimilar_returnsFalse() {
        assertFalse(name.isSimilar(null));
    }
}
