package contacts;

/**
 * Created by LHW on 2018/2/3.
 */
public class Contact {
    private  Long id;
    private  String firstName;
    private  String lastName;
    private  String phoneNumber;
    private  String emailAddress;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getId() {
        return id;

    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
/* @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;

        Contact contact = (Contact) o;

        if (!id.equals(contact.id)) return false;
        if (firstname != null ? !firstname.equals(contact.firstname) : contact.firstname != null) return false;
        if (lastname != null ? !lastname.equals(contact.lastname) : contact.lastname != null) return false;
        if (phoneNumber != null ? !phoneNumber.equals(contact.phoneNumber) : contact.phoneNumber != null) return false;
        return emailAddress != null ? emailAddress.equals(contact.emailAddress) : contact.emailAddress == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (emailAddress != null ? emailAddress.hashCode() : 0);
        return result;
    }*/
}
