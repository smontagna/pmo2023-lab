package it.unibo.oop.lab.exception1;

/**
 * Models a generic Robot.
 * 
 */
public class Robot {

    private static final int BATTERY_EMPTY = 0;
    private static final int MOVEMENT_DELTA = 1;
    private static final double MOVEMENT_DELTA_CONSUMPTION = 0.1;
    private static final double BATTERY_FULL = 100;

    private double batteryLevel;
    private final RobotEnvironment environment;
    private final String robotName;

    /**
     * 
     * @param robotName
     *            name of the robot
     * @param batteryLevel
     *            initial battery level
     * @throws Exception
     */
    public Robot(final String robotName, final double batteryLevel) {
        this.batteryLevel = batteryLevel;
        this.environment = new RobotEnvironment(new RobotPosition(0, 0));
        this.robotName = robotName;
    }

    /**
     * Moves the robot up by one unit.
     * 
     * @return If the Up movement has been performed
     */
    public boolean moveUp() {
        return moveToPosition(environment.getCurrPosX(), this.environment.getCurrPosY() + Robot.MOVEMENT_DELTA);
    }

    /**
     * Moves the robot down by one unit.
     * 
     * @return If the Down movement has been performed
     */
    public boolean moveDown() {
        return this.moveToPosition(this.environment.getCurrPosX(), environment.getCurrPosY() - Robot.MOVEMENT_DELTA);
    }

    /**
     * Moves the robot left by one unit.
     * 
     * @return A boolean indicating if the Left movement has been performed
     */
    public boolean moveLeft() {
        return this.moveToPosition(this.environment.getCurrPosX() - Robot.MOVEMENT_DELTA,
                this.environment.getCurrPosY());
    }

    /**
     * Moves the robot right by one unit.
     * 
     * @return A boolean indicating if the Right movement has been performed
     */
    public boolean moveRight() {
        return this.moveToPosition(this.environment.getCurrPosX() + Robot.MOVEMENT_DELTA,
                this.environment.getCurrPosY());
    }

    /**
     * Fully recharge the robot.
     */
    public void recharge() {
        this.batteryLevel = BATTERY_FULL;
    }

    /**
     * move a robot to the specified position.
     * 
     * @param newX
     *            the new X position to move the robot to
     * @param newY
     *            the new Y position to move the robot to
     * @return true if robot gets moved, false otherwise
     */
    private boolean moveToPosition(final int newX, final int newY) {
        boolean returnValue = true;
        if (this.isBatteryEnoughToMove()) {
            if (this.environment.move(newX, newY)) {
                this.consumeBatteryForMovement();
                this.log("Moved to position(" + newX + "," + newY + ").");
            } else {
                this.log("Can not move to (" + newX + "," + newY
                        + ") the robot is touching at least one world boundary");
                returnValue = false;
            }
        } else {
            this.log("Can not move to position(" + newX + "," + newY + "). Not enough battery.");
            returnValue = false;
        }
        return returnValue;
    }

    /**
     * Consume the amount of energy required to move the robot substracting it
     * from the current battery level.
     */
    protected void consumeBatteryForMovement() {
        this.consumeBattery(Robot.MOVEMENT_DELTA_CONSUMPTION);
    }

    /**
     * Consume the amount of energy provided in input from the battery.
     * 
     * @param amount
     *            the amount of battery energy to consume
     */
    protected void consumeBattery(final double amount) {
        if (batteryLevel >= amount) {
            this.batteryLevel -= amount;
        } else {
            this.batteryLevel = BATTERY_EMPTY;
        }
    }

    /**
     * 
     * @return A boolean indicating if the robot has enough energy to move
     */
    protected boolean isBatteryEnoughToMove() {
        return this.getBatteryLevel() >= Robot.MOVEMENT_DELTA_CONSUMPTION;
    }

    /**
     * 
     * @return The robot's current battery level
     */
    public double getBatteryLevel() {
        return (double) Math.round(this.batteryLevel * 100) / 100;
    }

    /**
     * 
     * @return The robot environment
     */
    public RobotEnvironment getEnvironment() {
        return this.environment;
    }

    /**
     * Log to stdout the string provided in input.
     * 
     * @param msg
     *            the msg to print
     */
    protected void log(final String msg) {
        System.out.println("[" + this.robotName + ":]" + msg);
    }
}
