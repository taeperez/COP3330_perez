import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactItemTest {
    @Test
    public void creationFailsWithALlBlankValues() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ContactItem("", "", "", "");
        });
    }

    @Test
    public void creationSucceedsWithBlankEmail() {
        ContactItem c = new ContactItem("Ariana", "Grande", "1567693435", "");
        assertEquals("Ariana", c.getFirstName());
        assertEquals("Grande", c.getLastName());
        assertEquals("1567693435", c.getPhoneNumber());
        assertEquals("", c.getEmailAddress());
    }

    @Test
    public void creationSucceedsWithBlankFirstName() {
        ContactItem c = new ContactItem("", "Grande", "1567693435", "arianagrande@positions.com");
        assertEquals("", c.getFirstName());
        assertEquals("Grande", c.getLastName());
        assertEquals("1567693435", c.getPhoneNumber());
        assertEquals("arianagrande@positions.com", c.getEmailAddress());
    }

    @Test
    public void creationSucceedsWithBlankLastName() {
        ContactItem c = new ContactItem("Ariana", "", "1567693435", "arianagrande@positions.com");
        assertEquals("Ariana", c.getFirstName());
        assertEquals("", c.getLastName());
        assertEquals("1567693435", c.getPhoneNumber());
        assertEquals("arianagrande@positions.com", c.getEmailAddress());
    }

    @Test
    public void creationSucceedsWithBlankPhoneNumber() {
        ContactItem c = new ContactItem("Ariana", "Grande", "", "arianagrande@positions.com");
        assertEquals("Ariana", c.getFirstName());
        assertEquals("Grande", c.getLastName());
        assertEquals("", c.getPhoneNumber());
        assertEquals("arianagrande@positions.com", c.getEmailAddress());
    }

    @Test
    public void creationSucceedsWithNonBlankValues() {
        ContactItem c = new ContactItem("Ariana", "Grande", "1567693435", "arianagrande@positions.com");
        assertEquals("Ariana", c.getFirstName());
        assertEquals("Grande", c.getLastName());
        assertEquals("1567693435", c.getPhoneNumber());
        assertEquals("arianagrande@positions.com", c.getEmailAddress());
    }

    @Test
    public void editingFailsWithAllBlankValues() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ContactItem("", "", "", "");
        });
    }

    @Test
    public void editingSucceedsWithBlankEmail() {
        ContactItem c = new ContactItem("Ariana", "Grande", "1567693435", "");
        assertEquals("Ariana", c.getFirstName());
        assertEquals("Grande", c.getLastName());
        assertEquals("1567693435", c.getPhoneNumber());
        assertEquals("", c.getEmailAddress());
    }

    @Test
    public void editingSucceedsWithBlankFirstName() {
        ContactItem c = new ContactItem("", "Grande", "1567693435", "arianagrande@positions.com");
        assertEquals("", c.getFirstName());
        assertEquals("Grande", c.getLastName());
        assertEquals("1567693435", c.getPhoneNumber());
        assertEquals("arianagrande@positions.com", c.getEmailAddress());
    }

    @Test
    public void editingSucceedsWithBlankLastName() {
        ContactItem c = new ContactItem("Ariana", "", "1567693435", "arianagrande@positions.com");
        assertEquals("Ariana", c.getFirstName());
        assertEquals("", c.getLastName());
        assertEquals("1567693435", c.getPhoneNumber());
        assertEquals("arianagrande@positions.com", c.getEmailAddress());
    }

    @Test
    public void editingSucceedsWithBlankPhone() {
        ContactItem c = new ContactItem("Ariana", "Grande", "", "arianagrande@positions.com");
        assertEquals("Ariana", c.getFirstName());
        assertEquals("Grande", c.getLastName());
        assertEquals("", c.getPhoneNumber());
        assertEquals("arianagrande@positions.com", c.getEmailAddress());
    }

    @Test
    public void editingSucceedsWithNonBlankValues() {
        ContactItem c = new ContactItem("Ariana", "Grande", "1567693435", "arianagrande@positions.com");
        assertEquals("Ariana", c.getFirstName());
        assertEquals("Grande", c.getLastName());
        assertEquals("1567693435", c.getPhoneNumber());
        assertEquals("arianagrande@positions.com", c.getEmailAddress());
    }
}

