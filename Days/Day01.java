import java.util.*;
import java.io.*;
public class Day01
{
	public static void main(String[] args) throws FileNotFoundException {
		// Setup
	    Scanner scan = new Scanner(new File("input.txt"));
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		int distances = 0;
		while(scan.hasNextInt()) {
		    left.add(scan.nextInt());
		    right.add(scan.nextInt());
		}
        scan.close();

		// Part 1
        Collections.sort(left);
        Collections.sort(right);
		for(int i = 0; i < left.size(); i++) {
		    distances += Math.abs(left.get(i) - right.get(i));
		}
		System.out.println("Part 1: " + distances);

		// Part 2
		int score = 0;
		for(int l : left) {
			int frequency = 0;
			for(int r : right) {
				if(l == r) {
					frequency++;
				}
			}
			score += l * frequency;
		}
		System.out.println("Part 2: " + score);
	}
}