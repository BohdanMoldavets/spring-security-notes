package com.moldavets.eazy_bank.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "accounts_transactions")
public class AccountTransaction {

    @Id
    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "customer_id")
    private String customerId;

    @Column(name = "transaction_dt")
    private Date transactionDt;

    @Column(name = "transaction_summary")
    private String transactionSummary;

    @Column(name = "transaction_type")
    private String transactionType;

    @Column(name = "transaction_amt")
    private Integer transactionAmt;

    @Column(name = "closing_balance")
    private Integer closingBalance;

    @Column(name = "create_dt")
    private Date createDt;

    public AccountTransaction() {
    }

    public AccountTransaction(String transactionId, String accountNumber,
                              String customerId, Date transactionDt, String transactionSummary,
                              String transactionType, Integer transactionAmt,
                              Integer closingBalance, Date createDt) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.customerId = customerId;
        this.transactionDt = transactionDt;
        this.transactionSummary = transactionSummary;
        this.transactionType = transactionType;
        this.transactionAmt = transactionAmt;
        this.closingBalance = closingBalance;
        this.createDt = createDt;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getTransactionDt() {
        return transactionDt;
    }

    public void setTransactionDt(Date transactionDt) {
        this.transactionDt = transactionDt;
    }

    public String getTransactionSummary() {
        return transactionSummary;
    }

    public void setTransactionSummary(String transactionSummary) {
        this.transactionSummary = transactionSummary;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public Integer getTransactionAmt() {
        return transactionAmt;
    }

    public void setTransactionAmt(Integer transactionAmt) {
        this.transactionAmt = transactionAmt;
    }

    public Integer getClosingBalance() {
        return closingBalance;
    }

    public void setClosingBalance(Integer closingBalance) {
        this.closingBalance = closingBalance;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }
}
