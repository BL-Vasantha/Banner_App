/**
 * OOPSBannerApp UC4: Render OOPS as Banner using Arrays and Loop
 *
 * This program demonstrates:
 * - Using arrays to store each letter
 * - Storing the entire banner in a 2D array
 * - Printing the banner using loops
 * - Improved modularity and maintainability
 *
 * Author: Vasantha R
 * Version: 1.4
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Define each letter as an array of strings (7 lines each)
        String[] O = {
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
        };

        String[] P = {
                "*****",
                "**  **",
                "**  **",
                "*****",
                "**   ",
                "**   ",
                "**   "
        };

        // Properly shaped S
        String[] S = {
                " *****",   // top curve
                "**     ",  // upper vertical
                "**     ",  // upper vertical
                "  ***  ",  // middle curve
                "     **",  // lower vertical (shifted right)
                "     **",  // lower vertical
                " *****"    // bottom curve
        };

        // Combine letters into a 2D banner array
        String[][] banner = new String[7][4]; // 4 letters: O, O, P, S

        // Assign letters to banner (O, O, P, S)
        for (int i = 0; i < 7; i++) {
            banner[i] = new String[]{O[i], O[i], P[i], S[i]};
        }

        // Loop through the banner array and print each line
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(banner[i][j] + "  "); // spacing between letters
            }
            System.out.println(); // new line after each row
        }
    }
}


