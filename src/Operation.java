import java.io.Serializable;
import java.util.Date;

public class Operation implements Serializable {

    private Date date;
    private double amount;
    private String description;

    public Operation( double amount, String description) {
        this.date = new Date();
        this.amount = amount;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "date=" + date +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
