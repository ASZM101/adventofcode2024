/*
MMMSXXMASM
MSAMXMSMSA
AMXSXMAAMM
MSAMASMSMX
XMASAMXAMM
XXAMMXXAMA
SMSMSASXSS
SAXAMASAAA
MAMMMXMMMM
MXMXAXMASX
18
 */
import java.util.*;
import java.io.*;
public class Day4 {
    public static void main(String[] args) throws FileNotFoundException {
        // Setup
        Scanner scan = new Scanner(new File("Days/input.txt")); // Update with actual input, REMOVE Days/ before pushing
        int count = 0;
        List<List<Character>> puzzle = new ArrayList<List<Character>>();
        /*
        Patterns (may overlap):
        - Horizontal right
        - Horizontal left
        - Vertical down
        - Vertical up
        - Diagonal right/down
        - Diagonal left/down
        - Diagonal right/up
        - Diagonal left/up
         */
        // while(scan.hasNextLine()) {
        //     puzzle.add(Arrays.asList(scan.nextLine().toCharArray()));
        //     //WIP
        // }
        // for(int i = 0; i < puzzle.size(); i++) {
        //     for(String s)
        //     //WIP
        // }
        scan.close();
        System.out.println("Part 1: " + count);
        System.out.println("Part 2: ");
    }
}