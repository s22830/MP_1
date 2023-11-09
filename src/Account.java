import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Account implements Serializable {

    private static final long serialVersionUID=1L;
    private static int nextId = 1;
    private int id;
    private double balance;
    private List<Operation> operations;

    public Account() {
        this.id = nextId++;
        this.balance = 0.0;
        operations = new ArrayList<>();
    }

    public void addOperation(double amount, String description) {
        Operation operation = new Operation(amount, description);
        operations.add(operation);
        balance = balance + amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", operations=" + operations +
                '}';
    }
}
