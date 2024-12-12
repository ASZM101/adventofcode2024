# Advent of Code 2024

<details>
    <summary>Day 1</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was to find the positive difference between two sets of numbers after ordering each set in ascending order. For part 2, the problem was to find the similarity score, defined as the sum of the number of times each number of the first set appears in the second set multiplied by the number in the first set, between the two sets.<br><br>
    <b>Approach and Strategy</b>
    <br>I approached this problem by using ArrayLists because they allowed me to store an undefined amount of elements that may have duplicates, order them by their natural ascending order using the sort method of the Collections class, and access the corresponding values on the left and right sides by their indices. For calculating the differences, I used <code>distance += Math.abs(left.get(i) - right.get(i))</code>, where left and right are ArrayLists, i is a counter in a for loop, and distance is the sum of the differences. For the similarity score, I used <code>score += l * frequency</code>, where l is the current integer in the first/left ArrayList, frequency is the count of the current left integer in the second/right ArrayList, and score is the sum of the similarity scores.<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation is moderately efficient, considering that I aimed to use the same code to solve both parts 1 and 2. However, it would have been more efficient if I had approached each part separately since it would have allowed me to use data structures that are more suited to each part.<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>I can improve my code by using PriorityQueues for part 1 and a HashMap for part 2. This challenge helped me learn that even though a single problem can be solved in many different ways, certain methods can be better in some aspects than others.<br><br>
</details>
<details>
    <summary>Day 2</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was to count the number of rows that had either all increasing or all decreasing numbers, a minimum difference of 1 integer between all adjacent numbers, and a maximum difference of 3 integers between all adjacent numbers. For part 2, the problem was similar to part 1, but the total sum had to include rows that met the requirements if one number was removed.<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by iterating over each line, saving it as <code>int[] report = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray()</code>, and iterating over each integer in the report. I then used conditional statements to check whether the very first number is decreasing in respect to the second number, all the numbers are increasing with <code>(!increasing && report[r] < report[r + 1]) || (increasing && report[r] > report[r + 1] && r != 0)</code>, and each number has a permitted difference in respect to their adjacent numbers with <code>(Math.abs(report[r] - report[r + 1]) < 1) || (Math.abs(report[r] - report[r + 1]) > 3)</code>. I approached part 2 by creating a copy of the current report, iterating over the report, iterating over the report within the initial loop, creating a new integer array without the number at the current index, and iterating once more over the report within the original loop using the conditional statements from part 1.<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation is not very efficient since it uses brute force to to test the removal of every single number in each row that didn’t meet the requirements, but it correctly solves both parts using the sample or puzzle input.<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>I can improve my code by determining which indices would truly need to be checked when a line doesn’t meet the requirements at a specific number. Overall, some lessons I learned from this challenge are that brute force can be useful for solving problems in code, but they are often not very efficient.<br><br>
</details>
<details>
    <summary>Day 3</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was to find valid multiplication instructions in the format mul(int1,int2) while ignoring invalid instructions and other characters. For part 2, the problem was similar to part 1, but the multiplication instructions were ignored if a valid don’t() instruction was found and reactivated when a valid do() instruction was found, taking into account the most recent instruction detected.<br><br>
    <b>Approach and Strategy</b>
    <br>I approached the problem by using Strings to store each line and using various String methods throughout the program. For example, for each line, I stored the line as a variable called line, declared a variable called start, initialized it with <code>line.indexOf("mul(")</code>, and iterated over the current line of the input while <code>while(start != -1)</code>, changing the content of the variable line to <code>(start + /*end of valid/invalid instruction*/ != line.length() - 1) ? line.substring(start + /*end of valid/invalid instruction*/ + 1) : ""</code>.<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation may not be very efficient since it iterates over each line up to three times per mul() instruction: the first time to locate do() and don’t() instructions before the mul() instruction found, the second time to determine whether a mul() instruction is valid, and the third time to locate do() and don’t() instructions after the last mul() instruction of the current line.<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by using regular expressions instead of String.indexOf() to find mul(), do(), and don’t() instructions and determine whether they are valid. I learned the fundamentals of how to use regex after completing the challenge and obtaining both stars, but even though I didn’t use regex for this particular challenge, I will most likely apply this knowledge in future problems.<br><br>
</details>
<!-- <details>
    <summary>Day 4</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 5</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 6</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 7</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 8</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 9</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 10</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 11</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 12</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 13</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 14</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 15</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 16</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 17</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 18</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 19</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 20</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 21</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 22</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 23</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 24</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details>
<details>
    <summary>Day 25</summary>
    <br>
    <b>Problem Analysis</b>
    <br>For part 1, the problem was . For part 2, the problem was .<br><br>
    <b>Approach and Strategy</b>
    <br>I approached part 1 by . I approached part 2 by .<br><br>
    <b>Implementation Reflection</b>
    <br>My implementation's efficiency is , but it could be improved by .<br><br>
    <b>Improvements and Lessons Learned</b>
    <br>Some ways I can improve my code is by . Overall, some lessons I learned from this challenge are .<br><br>
</details> -->