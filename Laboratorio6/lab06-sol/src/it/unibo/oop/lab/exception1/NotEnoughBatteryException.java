package it.unibo.oop.lab.exception1;

/**
 * 
 */
public class NotEnoughBatteryException extends IllegalStateException {

    private static final long serialVersionUID = 1L;
    private final double batteryLevel;
    private final double batteyRequired;

    /**
     * 
     * @param batteryLevel
     *            current battery level
     * @param required
     *            level required to perform move
     */
    public NotEnoughBatteryException(final double batteryLevel, final double required) {
        super();
        this.batteryLevel = batteryLevel;
        this.batteyRequired = required;
    }

    /**
     * 
     * @return string representation of this exception
     */
    @Override
    public String toString() {
        return "No enough battery for moving. Battery level is " + batteryLevel
            + " battery required is " + batteyRequired;
    }

    /**
     * 
     * @return string representation of this exception
     */
    @Override
    public String getMessage() {
        return this.toString();
    }
}
