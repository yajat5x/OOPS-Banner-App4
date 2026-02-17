/**
 * OOPS Banner App UC4
 * Render OOPS banner using String Array and Loop
 * Uses String.join() and for-each loop
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create String array to store 7 banner lines
        String[] lines = new String[7];

        // Step 2: Populate each line using String.join()

        lines[0] = String.join(" ", " *** ", " *** ", " ***** ", " ***** ");
        lines[1] = String.join(" ", "*   *", "*   *", "*   *", "*     ");
        lines[2] = String.join(" ", "*   *", "*   *", "*   *", "*     ");
        lines[3] = String.join(" ", "*   *", "*   *", " *****", " ***** ");
        lines[4] = String.join(" ", "*   *", "*     ", "*     ", "     *");
        lines[5] = String.join(" ", "*   *", "*     ", "*     ", "     *");
        lines[6] = String.join(" ", " *** ", " *** ", "*     ", " ***** ");

        // Step 3: Use for-each loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
