import java.util.*;
import java.io.*;
public class Day03 {
    public static void main(String[] args) throws FileNotFoundException {
        // Setup
        Scanner scan = new Scanner(new File("input.txt"));
        String allowed = "1234567890";
        int totalSum = 0;
        int enabledSum = 0;
        boolean enabled = true;
        while(scan.hasNextLine()) {
            String line = scan.nextLine();
            int start = line.indexOf("mul(");
            while(start != -1) {
                // Part 2: Checks for do/don't with initial starting index
                String copy = line;
                int toggle = copy.indexOf("do");
                while(toggle != -1 && toggle < start) {
                    if(copy.substring(toggle, toggle + 4).equals("do()")) {
                        enabled = true;
                        copy = copy.substring(toggle + 4);
                    }
                    else if(copy.substring(toggle, toggle + 7).equals("don't()")) {
                        enabled = false;
                        copy = copy.substring(toggle + 7);
                    }
                    else {
                        copy = copy.substring(toggle + 2);
                    }
                    toggle = copy.indexOf("do");
                }

                // Part 1
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
                                totalSum += product;

                                // Part 2: Adds together products of enabled multiplications
                                if(enabled) {
                                    enabledSum += product;
                                }
                            }
                        }
                    }
                    line = (start + end != line.length() - 1) ? line.substring(start + end + 1) : "";
                }
                else {
                    line = (start + 3 != line.length() - 1) ? line.substring(start + 4) : "";
                }
                start = line.indexOf("mul(");

                // Part 2: Checks for do/don't after last multiplication of line
                if(start == - 1 && !line.equals("")) {
                    copy = line;
                    toggle = copy.indexOf("do");
                    while(toggle != -1) {
                        if(copy.substring(toggle, (toggle + 3 == copy.length() - 1) ? copy.length() : toggle + 4).equals("do()")) {
                            enabled = true;
                            copy = copy.substring((toggle + 3 == copy.length() - 1) ? copy.length() : toggle + 4);
                        }
                        else if(copy.substring(toggle, (toggle + 6 == copy.length() - 1) ? copy.length() : toggle + 7).equals("don't()")) {
                            enabled = false;
                            copy = copy.substring((toggle + 6 == copy.length() - 1) ? copy.length() : toggle + 7);
                        }
                        else {
                            copy = copy.substring((toggle + 1 == copy.length() - 1) ? copy.length() : toggle + 2);
                        }
                        toggle = copy.indexOf("do");
                    }
                }
            }
        }

        scan.close();
        System.out.println("Part 1: " + totalSum);
        System.out.println("Part 2: " + enabledSum);
    }
}