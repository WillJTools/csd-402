/*
 * Name: William Judd
 * Date: October 4, 2026
 * Class: CSD402-300H
 * Assignment: Module 10.2
 * Purpose: Creates a domestic division with state information.
 */

public class DomesticDivision extends Division {

    // Information specific to a domestic division.
    private String state;

    /*
     * The shared division information is passed to the superclass,
     * while the state is stored by the DomesticDivision class.
     */
    public DomesticDivision(String divisionName, int accountNumber,
                            String state) {

        super(divisionName, accountNumber);

        this.state = state;
    }

    /*
     * This implementation of display() includes the state
     * associated with the domestic division.
     */
    @Override
    public void display() {
        System.out.println("--------------------------------");
        System.out.println("DOMESTIC DIVISION");
        System.out.println("--------------------------------");
        System.out.println("Division Name:   " + divisionName);
        System.out.println("Account Number:  " + accountNumber);
        System.out.println("State:           " + state);
        System.out.println();
    }
}