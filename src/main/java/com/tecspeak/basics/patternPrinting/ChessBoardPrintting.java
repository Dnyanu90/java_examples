package com.tecspeak.basics.patternPrinting;
/**

 * Prints a standard 8x8 chessboard to the console with pieces
 * in their initial positions and alternating empty squares.
 *
 * <p>The board layout follows standard chess rules:
 * <ul>
 * <li>Row 0: Black major pieces</li>
 * <li>Row 1: Black pawns</li>
 * <li>Row 6: White pawns</li>
 * <li>Row 7: White major pieces</li>
 * <li>Rows 2–5: Empty squares with alternating pattern</li>
 * </ul>
 *
 * <p>Square coloring is simulated using:
 * <ul>
 * <li><code>.</code> for light squares</li>
 * <li><code>#</code> for dark squares</li>
 * </ul>
 *
 * @author Dnyaneshwar Mali
 * @version 1.0
 */
public class ChessBoardPrintting {

    /**

     * Program entry point. Iterates over rows and columns to
     * print the chessboard with pieces and square patterns.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        int n = 8;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {


                if (i == 0) {
                    printMajorPieces(j);
                } else if (i == 1) {
                    System.out.print(" p ");
                } else if (i == 6) {
                    System.out.print(" P ");
                } else if (i == 7) {
                    printMajorPieces(j);
                } else {
                    if ((i + j) % 2 == 0) {
                        System.out.print(" . ");
                    } else {
                        System.out.print(" # ");
                    }
                }
            }
            System.out.println();


        }
        System.out.println("Have fun playing Chess");
    }

    /**

     * Prints the appropriate major chess piece based on column index.
     *
     * <p>Piece mapping:
     * <ul>
     * <li>0, 7 → Rook (R)</li>
     * <li>1, 6 → Knight (N)</li>
     * <li>2, 5 → Bishop (B)</li>
     * <li>3 → Queen (Q)</li>
     * <li>4 → King (K)</li>
     * </ul>
     *
     * @param j the column index (0–7)
     */
    public static void printMajorPieces(int j) {
        switch (j) {
            case 0:
            case 7:
                System.out.print(" R ");
                break;
            case 1:
            case 6:
                System.out.print(" N ");
                break;
            case 2:
            case 5:
                System.out.print(" B ");
                break;
            case 3:
                System.out.print(" Q ");
                break;
            case 4:
                System.out.print(" K ");
                break;
            default:
                // No action required
        }
    }
}
