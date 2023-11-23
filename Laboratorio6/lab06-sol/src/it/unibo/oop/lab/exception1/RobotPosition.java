package it.unibo.oop.lab.exception1;

/**
 * Models a (x,y) position for a {@link it.unibo.oop.lab.exception1.Robot}.
 * 
 */
public class RobotPosition {

    private int x;
    private int y;

    /**
     * 
     * @param x
     *            x position
     * @param y
     *            y position
     */
    public RobotPosition(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 
     * @return X position
     */
    public int getX() {
        return this.x;
    }

    /**
     * 
     * @param x
     *            set x position
     */
    public void setX(final int x) {
        this.x = x;
    }

    /**
     * 
     * @return Y position
     */
    public int getY() {
        return this.y;
    }

    /**
     * 
     * @param y
     *            set y position
     */
    public void setY(final int y) {
        this.y = y;
    }
}
