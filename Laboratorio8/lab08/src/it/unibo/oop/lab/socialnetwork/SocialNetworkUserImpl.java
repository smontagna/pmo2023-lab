/**
 * 
 */
package it.unibo.oop.lab.socialnetwork;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * Instructions
 * 
 * This will be an implementation of
 * {@link it.unibo.oop.lab.socialnetwork.SocialNetworkUser}:
 * 
 * 1) complete the definition of the methods by following the suggestions
 * included in the comments below.
 * 
 * @param <U>
 *            Specific {@link User} type
 */
public class SocialNetworkUserImpl<U extends User> extends UserImpl implements SocialNetworkUser<U> {

    private final Map<String, Set<U>> friends;

    /**
     * Builds a user participating is a social network (age won't be set).
     * 
     * 
     * @param firstName
     *            the user firstname
     * @param lastName
     *            the user lastname
     * @param username
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */
    public SocialNetworkUserImpl(final String firstName, final String lastName, final String username) {
        this(firstName, lastName, username, -1);

    }

    /**
     * Builds a user participating in a social network.
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
    public SocialNetworkUserImpl(final String name, final String surname, final String user, final int userAge) {
        super(name, surname, user, userAge);
        this.friends = new HashMap<>(); // inference of type variables
    }

    /**
     * {@inheritDoc}
     */
    public boolean addFollowedUser(final String circle, final U user) {
        Set<U> circleFriends = this.friends.get(circle);
        if (circleFriends == null) {
            circleFriends = new HashSet<>();
            this.friends.put(circle, circleFriends);
        }
        return circleFriends.add(user);
    }

    /**
     *
     * If no group with groupName exists yet, this implementation must
     * return an empty Collection.
     * 
     * {@inheritDoc}
     */
    public Collection<U> getFollowedUsersInGroup(final String groupName) {
        final Collection<U> usersInCircle = this.friends.get(groupName);
        if (usersInCircle != null) {
            return new ArrayList<>(usersInCircle);
        }
        /*
         * Return a very fast, lightweight, unmodifiable, pre-cached empty list.
         */
        return Collections.emptyList();
    }

    /**
     * {@inheritDoc}
     */
    public List<U> getFollowedUsers() {
        /*
         * Pre-populate a Set in order to prevent duplicates
         */
        final Set<U> followedUsers = new HashSet<>();
        for (final Entry<String, Set<U>> group : friends.entrySet()) {
            followedUsers.addAll(group.getValue());
        }
        return new ArrayList<>(followedUsers);
    }

}
