
public class SlidingWindow {

   public static int maxSumSubarrayFixed(int[] nums, int k) {
   
    int windowSum =0;
    for(int i =0;i<k;i++){
        windowSum += nums[i]; 
    }
    int maxSum = windowSum;

    for(int i=k;i<nums.length;i++){
        maxSum += nums[i] - nums[i-k];
        maxSum = Math.max(maxSum,windowSum);

    }
    return maxSum;
    }
    
   
    

    public static void main(String[] args) {
       
        int[] arr1 = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println("--- 1. Fixed-Size Window ---");
        System.out.println("Input: [2, 1, 5, 1, 3, 2], k = " + k);
        System.out.println("Max Sum: " + maxSumSubarrayFixed(arr1, k)); // Expected: 9 (subarray: [5, 1, 3])

       
}
}