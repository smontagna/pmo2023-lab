package oop.lab03.bank.interfaces;

public class StrictBankAccount implements BankAccount {

    private static final double ATM_TRANSACTION_FEE = 1;
    private static final double MANAGEMENT_FEE = 5;
    private static final double TRANSACTION_FEE = 0.1;

    private final int usrID;
    private double balance;
    private int nTransactions;

    public StrictBankAccount(final int usrID, final double balance) {
        this.usrID = usrID;
        this.balance = balance;
    }

    private void transactionOp(final int usrID, final double amount) {
        if (checkUser(usrID)) {
            this.balance += amount;
            this.incTransactions();
        }
    }

    public void deposit(final int usrID, final double amount) {
        this.transactionOp(usrID, amount);
    }

    public void withdraw(final int usrID, final double amount) {
        if (isWithdrawAllowed(amount)) {
            this.transactionOp(usrID, -amount);
        }
    }

    public void depositFromATM(final int usrID, final double amount) {
        this.deposit(usrID, amount - StrictBankAccount.ATM_TRANSACTION_FEE);
    }

    public void withdrawFromATM(final int usrID, final double amount) {
        this.withdraw(usrID, amount + StrictBankAccount.ATM_TRANSACTION_FEE);
    }

    private void incTransactions() {
        nTransactions++;
    }

    public double getBalance() {
        return this.balance;
    }

    public int getTransactionsCount() {
        return nTransactions;
    }

    public void chargeManagementFees(final int usrID) {
        final double feeAmount = MANAGEMENT_FEE + (nTransactions * StrictBankAccount.TRANSACTION_FEE);
        if (checkUser(usrID) && isWithdrawAllowed(feeAmount)) {
            balance -= feeAmount;
            nTransactions = 0;
        }
    }

    private boolean checkUser(final int id) {
        return this.usrID == id;
    }

    private boolean isWithdrawAllowed(final double amount) {
        return balance >= amount;
    }
}
