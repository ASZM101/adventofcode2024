import java.util.*;
import java.io.*;
public class Day2 {
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
            for(int i = 0; i < report.length - 1; i++) {
                if(report[i] > report[i + 1] && i == 0) {
                    increasing = false;
                }
                if((!increasing && report[i] < report[i + 1]) || (increasing && report[i] > report[i + 1] && i != 0)) {
                    ordered = false;
                    problem = true;
                }
                if((Math.abs(report[i] - report[i + 1]) < 1) || (Math.abs(report[i] - report[i + 1]) > 3)) {
                    okDiff = false;
                    problem = true;
                }
            }
            safe += ordered && okDiff ? 1 : 0;

            // Part 2
            if(problem) {
                for(int j = 0; j < report.length; j++) {
                    int[] copy = new int[report.length - 1];
                    int h = 0;
                    for(int k = 0; k < report.length; k++) {
                        if(k != j) {
                            copy[h] = report[k];
                            h++;
                        }
                    }
                    increasing = true;
                    ordered = true;
                    okDiff = true;
                    for(int i = 0; i < copy.length - 1; i++) {
                        if(copy[i] > copy[i + 1] && i == 0) {
                            increasing = false;
                        }
                        if((!increasing && copy[i] < copy[i + 1]) || (increasing && copy[i] > copy[i + 1] && i != 0)) {
                            ordered = false;
                        }
                        if((Math.abs(copy[i] - copy[i + 1]) < 1) || (Math.abs(copy[i] - copy[i + 1]) > 3)) {
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