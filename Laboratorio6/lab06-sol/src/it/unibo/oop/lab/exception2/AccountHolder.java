package it.unibo.oop.lab.exception2;

/**
 * Models a generic owner of a bank account modeled by
 * {@link it.unibo.oop.lab.exception2.BankAccount}.
 * 
 */
public class AccountHolder {

    private final String name;
    private final String surname;
    private final Integer userID;

    /**
     * Initialize a new AccountHolder object with the params provided in input.
     * 
     * @param name
     *            holder first name
     * @param surname
     *            holder last name
     * @param accountID
     *            holder id
     */
    public AccountHolder(final String name, final String surname, final Integer accountID) {
        this.name = name;
        this.surname = surname;
        this.userID = accountID;
    }

    /**
     * 
     * @return The account holder name
     */
    public String getName() {
        return this.name;
    }

    /**
     * 
     * @return The account holder surname
     */
    public String getSurname() {
        return this.surname;
    }

    /**
     * 
     * @return The userID of the account holder
     */
    public Integer getUserID() {
        return this.userID;
    }

    /**
     * @return string representation of a holder
     */
    @Override
    public String toString() {
        return "[ACCOUNT HOLDER firstname=" + this.name + ", lastname=" + this.surname + "id=" + this.userID + "]";
    }
}
