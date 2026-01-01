package arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence128 {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        Solution solution = new Solution();
        int result = solution.longestConsecutive(nums);
        System.out.println(result);
    }
}


class Solution{
    public int longestConsecutive(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        HashSet<Integer> numset = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            numset.add(nums[i]);
        }

        int longestSub = 1;
        for(int num : numset){
            if(numset.contains(num-1)){
                continue;
            }
            else{
                int currentNum = num;
                int currentSub = 1;
                while(numset.contains(currentNum+1)){
                    currentNum++;
                    currentSub++;
                }
                longestSub = Math.max(longestSub, currentSub);
            }
        }
        return longestSub;
    
    }
}
