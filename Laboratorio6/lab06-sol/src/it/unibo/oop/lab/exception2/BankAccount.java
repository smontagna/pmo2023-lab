package it.unibo.oop.lab.exception2;

/**
 * Models a generic bank account.
 * 
 */
public interface BankAccount {

    /**
     * @param usrID
     *            id of the user requesting this operation
     * @param amount
     *            amount to be withdrawn
     * 
     * @throws WrongAccountHolderException
     *             if an unauthorized user tries to withdraw
     * @throws NotEnoughFoundsException
     *             if the balance is less than the amount to withdraw
     */
    void withdraw(int usrID, double amount);

    /**
     * 
     * @param usrID
     *            id of the user requesting this operation
     * @param amount
     *            amount to be credited
     * 
     * @throws WrongAccountHolderException
     *             if an unauthorized user tries to withdraw
     */
    void deposit(int usrID, double amount);

    /**
     * 
     * @param usrID
     *            id of the user requesting this opera
     * @param amount
     *            amount to be deposited via ATM
     * 
     * @throws WrongAccountHolderException
     *             if an unauthorized user tries to withdraw
     * @throws TransactionsOverQuotaException
     *             max no. of ATM transaction reached
     */
    void depositFromATM(int usrID, double amount);

    /**
     * 
     * @param usrID
     *            id of the user requesting this opera
     * @param amount
     *            amount to be withdrawn via ATM
     * 
     * @throws WrongAccountHolderException
     *             if an unauthorized user tries to withdraw
     * @throws TransactionsOverQuotaException
     *             max no. of ATM transaction reached
     * @throws NotEnoughFoundsException
     *             if not enough funds are available
     */
    void withdrawFromATM(int usrID, double amount);

    /**
     * 
     * @return The current balance
     */
    double getBalance();

    /**
     * 
     * @return The total number of transaction for the account
     */
    int getTransactionCount();

}
