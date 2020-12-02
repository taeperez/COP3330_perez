import java.time.LocalDate;

public class ContactItem {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String emailAddress;

    public ContactItem (String firstName, String lastName, String phoneNumber, String emailAddress){
        if(firstName.isBlank() && lastName.isBlank() && phoneNumber.isBlank() && emailAddress.isBlank())
        {
            throw new IllegalArgumentException("A contact must contain at least one of the following: first name, last name, phone number, or email address");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void update(String firstName, String lastName, String phoneNumber, String emailAddress) {
        if(firstName.isBlank() && lastName.isBlank() && phoneNumber.isBlank() && emailAddress.isBlank()) {
            throw new IllegalArgumentException("Warning: At least one of the following fields must be filled: first name, last name, phone number, or email address");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getEmailAddress(){
        return emailAddress;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s", firstName, lastName, phoneNumber, emailAddress);
    }
}

