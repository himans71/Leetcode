/*

167. Two Sum II - Input Array Is Sorted
Solved
Medium

Topics

Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, 
find two numbers such that they add up to a specific target number. 
Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
Return the indices of the two numbers index1 and index2, each incremented by one, 
as an integer array [index1, index2] of length 2.
The tests are generated such that there is exactly one solution. 
You may not use the same element twice.
Your solution must use only constant extra space.

Example 1:

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
Example 2:

Input: numbers = [2,3,4], target = 6
Output: [1,3]
Explanation: The sum of 2 and 4 is 6. Therefore index1 = 1, index2 = 3. We return [1, 3].
Example 3:

Input: numbers = [-1,0], target = -1
Output: [1,2]
Explanation: The sum of -1 and 0 is -1. Therefore index1 = 1, index2 = 2. We return [1, 2].
 */

import java.util.Arrays;

public class twoSum {

    public static int[] twoSum(int[] arr, int target) {

        int i = 0;
        int j = arr.length-1;

        while(i<=j && j>=i){
            int sum = arr[i]+arr[j];
            if(sum==target){
                return new int[]{i+1,j+1};
            }
            else if(sum > target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{};
        
    }

    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 18;

        int[] result = twoSum(arr, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        }
        else {
            System.out.println("No pair found");
        }
    }
}

