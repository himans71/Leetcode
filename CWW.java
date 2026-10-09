public class CWW {

    // Solution logic for LeetCode 11: Container With Most Water
    public static int maxArea(int[] height) {
        
        int l =0;
        int r = height.length -1;

        int maxArea =0;

        while(l<r){
            int width = r-l;
            int minL = Math.min(height[l],height[r]);
            int currWater = width*minL;

            maxArea = Math.max(currWater,maxArea);

            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxArea;

    }

    public static void main(String[] args) {
        // Test Case 1: Standard example
        int[] heights1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result1 = maxArea(heights1);
        System.out.println("Test Case 1 Output: " + result1); // Expected: 49

        // Test Case 2: Just two bars
        int[] heights2 = {1, 1};
        int result2 = maxArea(heights2);
        System.out.println("Test Case 2 Output: " + result2); // Expected: 1

        // Test Case 3: Decreasing heights
        int[] heights3 = {4, 3, 2, 1, 4};
        int result3 = maxArea(heights3);
        System.out.println("Test Case 3 Output: " + result3); // Expected: 16
    }
}