import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Bank implements Serializable {
    private List<Account> accounts;
    private List<Employee> employees;
    private static List<Bank> banks = new ArrayList<>();

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Bank() {
        this.employees=new ArrayList<>();
        this.accounts = new ArrayList<>();
        banks.add(this);
    }

    public void saveAccountToFile(String fileName) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(accounts);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void loadAccountFromFile(String fileName) {
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            accounts = (List<Account>) objectInputStream.readObject();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public Account createAccount() {
        Account account = new Account();
        accounts.add(account);
        return account;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }

    public static List<Bank> getBanks(){
        return Collections.unmodifiableList(banks);
    }
}
