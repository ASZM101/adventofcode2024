import java.util.*;
import java.io.*;
public class Day3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("input.txt"));
        String allowed = "1234567890";
        int sum = 0;
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            int start = line.indexOf("mul(");
            while(start != -1) {
                String sub = line.length() < start + 12 ? line.substring(start) : line.substring(start, start + 12);
                int end = sub.indexOf(")");
                if(end != -1) {
                    String nums = sub.substring(4, end);
                    boolean realNums = true;
                    if(nums.indexOf(",") != -1) {
                        String[] arr = nums.split(",");
                        if(arr.length == 2) {
                            String num1 = arr[0];
                            String num2 = arr[1];
                            if(num1.length() > 0) {
                                for(int i = 0; i < num1.length(); i++) {
                                    if(allowed.indexOf(num1.charAt(i)) == -1) {
                                        realNums = false;
                                        break;
                                    }
                                }
                            }
                            if(realNums && num2.length() > 0) {
                                for(int i = 0; i < num2.length(); i++) {
                                    if(allowed.indexOf(num2.charAt(i)) == -1) {
                                        realNums = false;
                                        break;
                                    }
                                }
                            }
                            if(realNums) {
                                int product = Integer.parseInt(num1) * Integer.parseInt(num2);
                                sum += product;
                            }
                        }
                    }
                    line = (start + end != line.length() - 1) ? line.substring(start + end + 1) : "";
                }
                else {
                    line = (start + 3 != line.length() - 1) ? line.substring(start + 4) : "";
                }
                start = line.indexOf("mul(");
            }
        }
        scan.close();
        System.out.println("Part 1: " + sum);
        System.out.println("Part 2");
    }
}