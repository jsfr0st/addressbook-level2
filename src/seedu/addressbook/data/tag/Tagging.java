package seedu.addressbook.data.tag;

import seedu.addressbook.data.person.Person;

public class Tagging {
    private static final String ACTION_ADD = "+";
    private static final String ACTION_REMOVE = "-";
    
    public static enum Action {
        ADD, REMOVE
    }
    
    private Action action;
    private Person person;
    private Tag tag;
    
    public Tagging(Action action, Person person, Tag tag) {
        this.action = action;
        this.person = person;
        this.tag = tag;
    }
    
    /*
     *  Change the tagging if the person is removed
     */
    
    public void changeTagging() {
        if(this.action == Action.ADD) {
            this.action = Action.REMOVE;
        }else {
            this.action = Action.ADD;
        }
    }
    
    public Tag getTag() {
        return this.tag;
    }
    
    public Person getPerson() {
        return this.person;
    }
    
    @Override
    public String toString() {
        if(this.action == Action.ADD) {
            return ACTION_ADD + " " + this.person.getName() + " " + this.tag;
        }else {
            return ACTION_REMOVE + " " + this.person.getName() + " " + this.tag;
        }
    }
}
