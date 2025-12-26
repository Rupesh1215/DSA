package arrays;
import java.util.*;

 class ArrayExceptSelf{
    public int[] product(int []nums){
        int []answer = new int[nums.length];

        Arrays.fill(answer,1);
        int pre=1,post=1;

        for(int i=0;i<nums.length;i++){
            answer[i]=pre;
            pre=nums[i]*pre;
        }

        for(int i=nums.length-1;i>=0;i--){
            answer[i]=answer[i]*post;
            post = nums[i]*post;
        }
        return answer;

    }
}

class ProductOfArrayExceptSelf238{
    public static void main(String [] args){
        ArrayExceptSelf arr = new ArrayExceptSelf();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter length of the array : ");
        int n= s.nextInt();
        System.out.println("Enter elements of array : ");
        int [] nums = new int [n];
        for(int i=0;i<n;i++){
            nums[i]= s.nextInt();
        }
        System.out.println("Product of Array Except Self : ");
        int []result = arr.product(nums);
        System.out.println(Arrays.toString(result));

    }
}
