import java.util.*;

class SumOffour18 {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n; i++){

            // skip duplicates for i
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            for(int j = i + 1; j < n; j++){

                // skip duplicates for j
                if(j > i + 1 && nums[j] == nums[j - 1]) continue;

                int p = j + 1;
                int q = n - 1;

                while(p < q){
                    long sum = (long)nums[i] + nums[j] + nums[p] + nums[q];

                    if(sum == target){
                        li.add(Arrays.asList(nums[i], nums[j], nums[p], nums[q]));

                        // skip duplicates
                        while(p < q && nums[p] == nums[p + 1]) p++;
                        while(p < q && nums[q] == nums[q - 1]) q--;

                        p++;   
                        q--;  
                        
                    }
                    else if(sum > target){
                        q--;
                    } else {
                        p++;
                    }
                }
            }
        }
        return li;
    }

    public static void main(String[] args) {
        int nums[] = {-3, -1, 0, 2, 4, 5};
        int target = 2;
        System.out.println(fourSum(nums, target));
    }
}