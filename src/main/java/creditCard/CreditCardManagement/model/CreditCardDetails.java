package creditCard.CreditCardManagement.model;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="Credit_Card_Details")
public class CreditCardDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String bankName;

    private double creditLimit;

    private String statementCloseDate;

    private double lastMonthBalance;

    private String  paymentDueDate;


    public CreditCardDetails(Long id, String bankName, double creditLimit, String statementCloseDate,
                             double lastMonthBalance, String paymentDueDate) {
        super();
        this.id = id;
        this.bankName = bankName;
        this.creditLimit = creditLimit;
        this.statementCloseDate = statementCloseDate;
        this.lastMonthBalance = lastMonthBalance;
        this.paymentDueDate = paymentDueDate;
    }

    public CreditCardDetails() {

    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }
    public String getStatementCloseDate() {
        return statementCloseDate;
    }
    public void setStatementCloseDate(String statementCloseDate) {
        this.statementCloseDate = statementCloseDate;
    }
    public double getLastMonthBalance() {
        return lastMonthBalance;
    }
    public void setLastMonthBalance(double lastMonthBalance) {
        this.lastMonthBalance = lastMonthBalance;
    }
    public String getPaymentDueDate() {
        return paymentDueDate;
    }
    public void setPaymentDueDate(String paymentDueDate) {
        this.paymentDueDate = paymentDueDate;
    }

}
