package Arrays;
import java.util.*;

class FrequentElement{
    public int[] topFrequent(int[] nums, int k){
        if(k == nums.length){
            return nums;
        }

        Map<Integer, Integer> count = new HashMap<>();
        for(int n:nums){
            count.put(n,count.getOrDefault(n,0)+1);
        }

        Queue<Integer> heap = new PriorityQueue<>(
            (a,b) -> count.get(a) - count.get(b)
        );

        for(int n:count.keySet()){
            heap.add(n);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] ans = new int[k];
        for(int i=0;i<k;i++){
            ans[i]=heap.poll();
        }

        return ans;
    }
}

class TopKFreElements347 {
    public static void main(String [] args){
        FrequentElement tk = new FrequentElement();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of k : ");
        int k = s.nextInt();
        System.out.println("Enter the size of array : ");
        int n = s.nextInt();
        System.out.println("Enter array elements : ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        int[] result = tk.topFrequent(nums,k);
        System.out.println("Top "+k+" Frequent Elements are : ");
        System.out.println(Arrays.toString(result));
    }    
}
