package com.xgill15x.neobudgettracker;

import jakarta.persistence.*;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="trans_id")
    private int id;

    @Column(name="expenseID")
    private int expenseID;

    @Column(name="payee")
    private String payee;

    @Column(name="spent")
    private float spent;

    @Column(name="transaction")
    private String transactionDate;

    @Column(name="username")
    private String userName;

    public String getUserName() { return userName; }

    public void setUserName(String userName) { this.userName = userName; }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExpenseID() { return expenseID; }

    public void setExpenseID(int expenseID) { this.expenseID = expenseID; }

    public String getPayee() {
        return payee;
    }

    public void setPayee(String payee) {
        this.payee = payee;
    }

    public float getSpent() {
        return spent;
    }

    public void setSpent(float spent) {
        this.spent = spent;
    }

    public String getTransactionDate() { return transactionDate; }

    public void setTransactionDate(String transactionDate) { this.transactionDate = transactionDate; }

    public Transaction(){

    }
}
