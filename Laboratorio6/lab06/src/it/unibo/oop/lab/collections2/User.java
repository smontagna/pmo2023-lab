/**
 * 
 */
package it.unibo.oop.lab.collections2;

/**
 * Represents the contract for a generic user.
 */
public interface User {

    /**
     * Return the age of this user.
     * 
     * @return age the age of this user
     */
    int getAge();

    /**
     * Returns a user's firstname.
     * 
     * @return the firstname of this user
     */
    String getFirstName();

    /**
     * Returns a user's surname.
     * 
     * @return the surname of this user
     */
    String getLastName();

    /**
     * Returns a user's username.
     * 
     * @return the username of this user
     */
    String getUsername();

    /**
     * Return true if the user has an age set.
     * 
     * @return true if the user defined an age during his/her registration
     *         process
     */
    boolean isAgeDefined();

}
