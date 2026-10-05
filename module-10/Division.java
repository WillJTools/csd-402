/*
 * Name: William Judd
 * Date: October 4, 2026
 * Class: CSD402-300H
 * Assignment: Module 10.2
 * Purpose: Creates the abstract Division superclass.
 */

public abstract class Division {

    // Information that every company division has in common.
    protected String divisionName;
    protected int accountNumber;

    /*
     * The superclass constructor allows the subclasses to reuse
     * the same code for the division name and account number.
     */
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }

    /*
     * Each type of division contains different information,
     * so the subclasses provide their own version of display().
     */
    public abstract void display();
}