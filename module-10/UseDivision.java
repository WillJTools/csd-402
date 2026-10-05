/*
 * Name: William Judd
 * Date: October 4, 2026
 * Class: CSD402-300H
 * Assignment: Module 10.2
 * Purpose: Creates and displays two international and two domestic divisions.
 */

public class UseDivision {

    public static void main(String[] args) {

        /*
         * Create two international divisions. Each object includes
         * the information inherited from Division as well as its
         * country and primary language.
         */
        InternationalDivision londonDivision =
                new InternationalDivision(
                        "London Technology Division",
                        4101,
                        "United Kingdom",
                        "English"
                );

        InternationalDivision tokyoDivision =
                new InternationalDivision(
                        "Tokyo Research Division",
                        4102,
                        "Japan",
                        "Japanese"
                );

        /*
         * Create two domestic divisions. These objects inherit
         * the division name and account number and add a state.
         */
        DomesticDivision charlotteDivision =
                new DomesticDivision(
                        "Charlotte Operations Division",
                        5101,
                        "North Carolina"
                );

        DomesticDivision omahaDivision =
                new DomesticDivision(
                        "Omaha Data Division",
                        5102,
                        "Nebraska"
                );

        // Display the information for all four company divisions.
        System.out.println();
        System.out.println("================================");
        System.out.println("       COMPANY DIVISIONS");
        System.out.println("================================");
        System.out.println();

        londonDivision.display();
        tokyoDivision.display();
        charlotteDivision.display();
        omahaDivision.display();

        System.out.println("================================");
        System.out.println("       END OF DIVISION LIST");
        System.out.println("================================");
    }
}