package it.unibo.oop.lab.exception1;

/**
 * Models the environment in which a {@link it.unibo.oop.lab.exception1.Robot}
 * is situated.
 * 
 */
public class RobotEnvironment {

    /**
     * Environment upper bound for the X coordinate.
     */
    public static final int WORLD_X_UPPER_LIMIT = 50;
    /**
     * Environment lower bound for the X coordinate.
     */
    public static final int WORLD_X_LOWER_LIMIT = 0;
    /**
     * Environment upper bound for the Y coordinate.
     */
    public static final int WORLD_Y_UPPER_LIMIT = 80;
    /**
     * Environment lower bound for the X coordinate.
     */
    public static final int WORLD_Y_LOWER_LIMIT = 0;

    private final RobotPosition position;

    /**
     * Constructs a robot environment.
     * 
     * @param pos
     *            set robot initial position
     */
    public RobotEnvironment(final RobotPosition pos) {
        this.position = pos;
    }

    /**
     * Move the robot to a new position.
     * 
     * @param newX
     *            new position on X
     * @param newY
     *            new position on Y
     * 
     * @throws PositionOutOfBoundsException
     *             in case of stepping out of the world
     */
    public void move(final int newX, final int newY) {
        if (newX >= RobotEnvironment.WORLD_X_LOWER_LIMIT
                && newX <= RobotEnvironment.WORLD_X_UPPER_LIMIT
                && newY >= RobotEnvironment.WORLD_Y_LOWER_LIMIT
                && newY <= RobotEnvironment.WORLD_Y_UPPER_LIMIT) {
            this.position.setX(newX);
            this.position.setY(newY);
        } else {
            throw new PositionOutOfBoundsException(newX, newY);
        }
    }

    /**
     * @return Current X position
     */
    public int getCurrPosX() {
        return this.position.getX();
    }

    /**
     * 
     * @return Current Y position
     */
    public int getCurrPosY() {
        return this.position.getY();
    }
}
