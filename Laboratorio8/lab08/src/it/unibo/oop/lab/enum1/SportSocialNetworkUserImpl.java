/**
 * 
 */
package it.unibo.oop.lab.enum1;

import it.unibo.oop.lab.socialnetwork.SocialNetworkUserImpl;
import it.unibo.oop.lab.socialnetwork.User;

/**
 * 
 * Represents a social network user along with the sports he/she likes to do or
 * to follow.
 * 
 * 1) Define the same behavior as done on the previous exercise: - you can reuse
 * the same class, but... - ..now make explicit reference to an enumeration
 * Sport rather than a nested static class
 * 
 * 
 * - NOTE: now we going to define Sport as an enumeration (in its own file
 * Sport.java)
 * 
 * 
 * @param <U>
 *            specific user type
 */
public class SportSocialNetworkUserImpl<U extends User> extends SocialNetworkUserImpl<U> {

    /*
     * TODO
     * 
     * add a field to keep track of the set of sports followed/done by a user
     */

    /**
     * Builds a new {@link SportSocialNetworkUserImpl}.
     * 
     * @param name
     *            the user firstname
     * @param surname
     *            the user lastname
     * @param user
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */
    public SportSocialNetworkUserImpl(final String name, final String surname, final String user) {
        this(name, surname, user, -1);
    }

    /**
     * Builds a new {@link SportSocialNetworkUserImpl}.
     * 
     * @param name
     *            the user firstname
     * @param surname
     *            the user lastname
     * @param userAge
     *            user's age
     * @param user
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */
    public SportSocialNetworkUserImpl(final String name, final String surname, final String user, final int userAge) {
        super(name, surname, user, userAge);
    }

    /*
     * [METHODS]
     * 
     * Redefine the methods below reusing the same code of previous exercise
     */

    /**
     * Add a new sport followed by this user: if the user already likes or does
     * the sport, nothing happens.
     * 
     * @param sport
     *            a sport followed/done by the user
     */
    // TODO
    public void addSport(final Sport sport) {

    }

    /**
     * Returns true if a user likes/does a given sport.
     * 
     * @param s
     *            sport to use as an input
     * 
     * @return true if the user likes sport s
     */
    public boolean hasSport(final Sport s) {
        return false;
    }
}
