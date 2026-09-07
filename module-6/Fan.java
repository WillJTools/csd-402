/*
 * File: Fan.java
 * Course: CSD402 Java for Programmers
 * Module: 6.2
 * Date: 9/6/2026
 * Author: William Judd
 *
 * Purpose:
 * Models a fan with speed, on/off state, radius, and color.
 */

public class Fan {

    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * Creates a Fan using the assignment's default values.
     */
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    /**
     * Creates a Fan using values supplied by the caller.
     *
     * @param speed fan speed constant
     * @param on true if the fan is on
     * @param radius fan radius
     * @param color fan color
     */
    public Fan(int speed, boolean on, double radius, String color) {
        setSpeed(speed);
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= STOPPED && speed <= FAST) {
            this.speed = speed;
        } else {
            this.speed = STOPPED;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String speedDescription() {
        switch (speed) {
            case SLOW:
                return "SLOW";
            case MEDIUM:
                return "MEDIUM";
            case FAST:
                return "FAST";
            default:
                return "STOPPED";
        }
    }

    @Override
    public String toString() {
        return "Fan{" +
            "speed=" + speedDescription() +
            ", on=" + on +
            ", radius=" + radius +
            ", color='" + color + '\'' +
            '}';
    }
}
