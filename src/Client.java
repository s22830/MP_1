import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private String surname;
    private String address;
    private String contactInfo;

    private List<Account> accounts;

    public Client(String name, String surname, String address, String contactInfo) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.contactInfo = contactInfo;
        this.accounts = new ArrayList<>();
    }
    public void addAccount(Account account){
        accounts.add(account);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
}
