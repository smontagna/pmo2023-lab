package it.unibo.oop.lab.collections2;

import java.util.Collection;
import java.util.List;

/**
 * Represents the user of a social network. A user follows other users and of
 * course can be followed as well.
 * 
 * @param <U>
 *            specific {@link User} type
 */
public interface SocialNetworkUser<U extends User> extends User {

    /**
     * Adds a friend to the list of this user's current friends.
     * 
     * @param group
     *            the group (circle) on which the user in going to be added
     * @param user
     *            the user to be added as a user followed
     * @return true if the user to be added as a followed person does not exist
     *         yet, false otherwise
     */
    boolean addFollowedUser(String group, U user);

    /**
     * Gets the list of every person followed by this user disregarding the
     * group.
     * 
     * @return the list of people followed by this user among all her groups
     */
    List<U> getFollowedUsers();

    /**
     * Gets the list of followed people belonging to a given group.
     * 
     * @param groupName
     *            the name of the group
     * @return the collection of people followed by this user within group
     *         "groupName".
     */
    Collection<U> getFollowedUsersInGroup(String groupName);

}
