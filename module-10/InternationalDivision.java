/*
 * Name: William Judd
 * Date: October 4, 2026
 * Class: CSD402-300H
 * Assignment: Module 10.2
 * Purpose: Creates an international division with country and language information.
 */

public class InternationalDivision extends Division {

    // Information specific to an international division.
    private String country;
    private String language;

    /*
     * The constructor receives all required division information.
     * super() sends the shared values to the Division constructor.
     */
    public InternationalDivision(String divisionName, int accountNumber,
                                 String country, String language) {

        super(divisionName, accountNumber);

        this.country = country;
        this.language = language;
    }

    /*
     * Displays the inherited division information along with
     * the country and language unique to this subclass.
     */
    @Override
    public void display() {
        System.out.println("--------------------------------");
        System.out.println("INTERNATIONAL DIVISION");
        System.out.println("--------------------------------");
        System.out.println("Division Name:   " + divisionName);
        System.out.println("Account Number:  " + accountNumber);
        System.out.println("Country:         " + country);
        System.out.println("Language:        " + language);
        System.out.println();
    }
}