/**
 * OOPSBannerApp prints the literal text "OOPS" to the console.
 *
 * This program demonstrates:
 * - Basic Java class structure
 * - Usage of the main method
 * - Arrays to store lines of text
 * - Concatenation of strings for ASCII art letters
 * - Console output using System.out.println
 *
 * Each letter of "OOPS" is represented using '*' characters.
 * The letter S is drawn with a curved shape using spaces and stars.
 *
 * @author Vasantha R
 * @version 1.3
 */
public class OOPSBannerApp {

    /**
     * Entry point of the Java application.
     *
     * @param args command-line arguments (not used in this program)
     */
    public static void main(String[] args) {
        // Array to hold each line of the final "OOPS" banner
        String[] lines = new String[7];

        // Array representing the curved S letter
        String[] S = new String[7];
        S[0] = " *****";    // Top curve of S
        S[1] = "**";        // Upper vertical of S
        S[2] = "**";        // Upper vertical of S
        S[3] = "  ***";     // Middle turning curve of S
        S[4] = "    **";    // Lower vertical of S
        S[5] = "    **";    // Lower vertical of S
        S[6] = " *****";    // Bottom curve of S

        // Construct each line of the banner by concatenating O, O, P, and S
        lines[0] = " ***   ***  *****" + S[0]; // Top row
        lines[1] = "** ** ** ** **   " + S[1]; // Second row
        lines[2] = "** ** ** ** **   " + S[2]; // Third row
        lines[3] = "** ** ** ** *****" + S[3]; // Fourth row (middle)
        lines[4] = "** ** ** ** **   " + S[4]; // Fifth row
        lines[5] = "** ** ** ** **   " + S[5]; // Sixth row
        lines[6] = " ***   ***  **  " + S[6]; // Bottom row

        // Loop through the lines array and print each line to the console
        for (String line : lines) {
            System.out.println(line);
        }
        
    }
}

