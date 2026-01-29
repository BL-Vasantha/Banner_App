public class OOPSBannerApp {

    /**
     * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
     *
     * This use case extends UC4 by defining and populating the String array
     * at the time of declaration using String.join() method to create each
     * line of the banner.
     *
     * @author Developer
     * @version 5.0
     */
    public static void main(String[] args) {
        // Inline declaration and initialization of banner lines
        String[] lines = {
                String.join("", "  *****  ", "  *****  ", " ******  ", "  *****  "),
                String.join("", " *     * ", " *     * ", " *     * ", " *        "),
                String.join("", " *     * ", " *     * ", " *     * ", " *        "),
                String.join("", " *     * ", " *     * ", " ******  ", "  *****  "),
                String.join("", " *     * ", " *     * ", " *        ", "       * "),
                String.join("", " *     * ", " *     * ", " *        ", "       * "),
                String.join("", "  *****  ", "  *****  ", " *        ", "  *****  ")
        };

        // Step 3: Print banner using enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}