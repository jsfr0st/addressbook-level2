package seedu.addressbook.common;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.Name;

public class UtilsTest {
    @Test
    public void inputNull_test() {
        String nullString = null;
        
      /*
       *  return true if input is null
       */
        assertTrue(Utils.isAnyNull(nullString));
    }
    
    @Test
    public void containsNull_test() {
        
        /*
         *  return true if input contains null
         */
        assertTrue(Utils.isAnyNull("1", null, "3"));
    }
    
    @Test
    public void noNull_test() {
        ArrayList<String> array = new ArrayList<String>();
        for(int i=1; i<=3; i++) {
            array.add("i");
        }
        /*
         *  return false if input contains no null
         */
        assertFalse(Utils.isAnyNull(array));
    }
    
    @Test
    public void uniqueName_Test() throws IllegalValueException {
        ArrayList<Name> array = new ArrayList<Name>();
        array.add(new Name("John"));
        array.add(new Name("Peter"));
        /*
         *  return true if inputs are unique
         */
        assertTrue(Utils.elementsAreUnique(array));
    }
    
    @Test
    public void notUniqueName_Test() throws IllegalValueException {
        ArrayList<Name> array = new ArrayList<Name>();
        array.add(new Name("John"));
        array.add(new Name("John"));
        /*
         *  return false if inputs are not unique
         */
        assertFalse(Utils.elementsAreUnique(array));
    }
}
