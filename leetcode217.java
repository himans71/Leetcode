import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            // HashSet.add() returns false if the element is already present
            if (!seen.add(num)) {
                return true;
            }
        }
        return false;
    }
}