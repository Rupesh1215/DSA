package Arrays;
import java.util.HashSet;
import java.util.Scanner;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> number = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(number.contains(nums[i])) return true;
            number.add(nums[i]);
            if(number.size() > k)
                number.remove(nums[i-k]);
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();
        System.out.println(solution.containsNearbyDuplicate(nums, k));
        scanner.close();
    }
}