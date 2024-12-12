import java.util.*;
import java.io.*;
public class Day02 {
    public static void main(String[] args) throws FileNotFoundException{
        // Setup
        Scanner scan = new Scanner(new File("input.txt"));
        int safe = 0;
        int semisafe = 0;
        while(scan.hasNextLine()) {
            int[] report = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            boolean problem = false;
            boolean increasing = true;
            boolean ordered = true;
            boolean okDiff = true;
            
            // Part 1
            for(int r = 0; r < report.length - 1; r++) {
                if(report[r] > report[r + 1] && r == 0) {
                    increasing = false;
                }
                if((!increasing && report[r] < report[r + 1]) || (increasing && report[r] > report[r + 1] && r != 0)) {
                    ordered = false;
                    problem = true;
                }
                if((Math.abs(report[r] - report[r + 1]) < 1) || (Math.abs(report[r] - report[r + 1]) > 3)) {
                    okDiff = false;
                    problem = true;
                }
            }
            safe += ordered && okDiff ? 1 : 0;

            // Part 2
            if(problem) {
                for(int r1 = 0; r1 < report.length; r1++) {
                    int[] copy = new int[report.length - 1];
                    int c1 = 0;
                    for(int r2 = 0; r2 < report.length; r2++) {
                        if(r1 != r2) {
                            copy[c1] = report[r2];
                            c1++;
                        }
                    }
                    increasing = true;
                    ordered = true;
                    okDiff = true;
                    for(int c2 = 0; c2 < copy.length - 1; c2++) {
                        if(copy[c2] > copy[c2 + 1] && c2 == 0) {
                            increasing = false;
                        }
                        if((!increasing && copy[c2] < copy[c2 + 1]) || (increasing && copy[c2] > copy[c2 + 1] && c2 != 0)) {
                            ordered = false;
                        }
                        if((Math.abs(copy[c2] - copy[c2 + 1]) < 1) || (Math.abs(copy[c2] - copy[c2 + 1]) > 3)) {
                            okDiff = false;
                        }
                    }
                    if(ordered && okDiff) {
                        problem = false;
                        break;
                    }
                }
            }
            semisafe += ordered && okDiff ? 1 : 0;
        }

        scan.close();
        System.out.println("Part 1: " + safe);
        System.out.println("Part 2: " + (semisafe));
    }
}