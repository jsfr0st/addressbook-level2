package seedu.addressbook.data.person;

import static org.junit.Assert.*;

import org.junit.Before;
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
    
    @Test
    public void same_isSimilar_returnsTrue() {
        assertTrue(name.isSimilar(name));
    }
    
    @Test
    public void isSimilar_sameNameDifferentCase_returnsTrue() throws IllegalValueException {
        Name input = new Name("John Smith");
        assertTrue(name.isSimilar(input));
    }
}
