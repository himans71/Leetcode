
import java.util.Arrays;

public class pallindrome {

    public static int[] palli(int[] arr, int target) {

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

