/**
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 *
 * Author: Developer
 * Version: 5.3
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline array initialization with proper S curve, keeping O and P unchanged
        String[] lines = {
                String.join("", "  ***  ", "  ***  ", " *****", "  *****"),  // Top line
                String.join("", " ** ** ", " ** ** ", " **  **", " **    "),  // Upper vertical
                String.join("", " ** ** ", " ** ** ", " **  **", " **    "),  // Upper vertical
                String.join("", " ** ** ", " ** ** ", " ***** ", "  *** "),  // Middle curve
                String.join("", " ** ** ", " ** ** ", " **    ", "    ** "),  // Lower vertical
                String.join("", " ** ** ", " ** ** ", " **    ", "    ** "),  // Lower vertical
                String.join("", "  ***  ", "  ***  ", " **    ", " *****")   // Bottom curve
        };

        // Print the banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
