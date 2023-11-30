package it.unibo.oop.lab.socialnetwork;

/**
 * This is a basic implementation of a {@link it.unibo.oop.lab.socialnetwork.User}
 * .
 * 
 * This class has already been implemented and can be used as it is.
 * 
 */
public class UserImpl implements User {

    private final String firstName;
    private final String lastName;
    private final Integer age;
    private final String username;
    /*
     * to be lazy-inited.
     */
    private int hash;

    /**
     * Builds a new UserImpl. An age not specified means that the age field is
     * going to have a value equal to -1
     * 
     * @param name
     *            the user firstname
     * @param surname
     *            the user lastname
     * @param user
     *            alias of the user, i.e. the way a user is identified on an
     *            application
     */
    public UserImpl(final String name, final String surname, final String user) {
        this(name, surname, user, -1);
    }

    /**
     * Builds a new UserImpl.
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
    public UserImpl(final String name, final String surname, final String user, final int userAge) {
        this.firstName = name;
        this.lastName = surname;
        this.age = userAge;
        this.username = user;
    }

    /**
     * {@inheritDoc}
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * {@inheritDoc}
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * {@inheritDoc}
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * {@inheritDoc}
     */
    public int getAge() {
        return this.age;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isAgeDefined() {
        return this.age > 0;
    }

    /**
     * {@inheritDoc}
     */
    public boolean equals(final Object o) {
        if (o instanceof UserImpl) {
            final UserImpl user = (UserImpl) o;
            return this.firstName.equals(user.getFirstName())
                    && this.lastName.equals(user.getLastName())
                    && this.username.equals(user.getUsername())
                    && this.age == user.getAge();
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public int hashCode() {
        /*
         * All fields are final and immutable: lazy init allowed.
         */
        if (hash == 0) {
            hash = firstName.hashCode() ^ lastName.hashCode() ^ username.hashCode() ^ age;
        }
        return hash;
    }

    /**
     * {@inheritDoc}
     */
    public String toString() {
        return "[ " + this.firstName + " " + this.lastName + " " + this.age + " " + this.username + " ]";
    }

}
