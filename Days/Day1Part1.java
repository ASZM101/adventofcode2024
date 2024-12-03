import java.util.*;
import java.io.*;
public class Day1Part1
{
	public static void main(String[] args) throws FileNotFoundException {
	    Scanner scan = new Scanner(new File("input1.txt"));
		List<Integer> left = new ArrayList<Integer>();
		List<Integer> right = new ArrayList<Integer>();
		int distances = 0;
		while(scan.hasNextInt()) {
		    left.add(scan.nextInt());
		    right.add(scan.nextInt());
		}
        scan.close();
        Collections.sort(left);
        Collections.sort(right);
		for(int i = 0; i < left.size(); i++) {
		    distances += Math.abs(left.get(i) - right.get(i));
		}
		System.out.println(distances);
	}
}
