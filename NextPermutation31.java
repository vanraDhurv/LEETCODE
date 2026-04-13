
import java.util.Arrays;

class NextPermutation31{
    public static void nextPermutation(int[] nums) {
        int n = nums.length-1;
        int n1[] = new int[n+1];
        if(nums[n]>nums[n-1]){
            int temp = nums[n];
            nums[n] = nums[n-1];
            nums[n-1] = temp;
            for(int i =0; i<nums.length;i++){
                System.out.print(nums[i] + " ");
            }
        }else{
            if(nums[0]<nums[n]){
                n1[0] = nums[n];
                for(int i =0; i<nums.length-1;i++){
                    n1[i+1] = nums[i];
                }

                
            }
            else{
                Arrays.sort(nums);
                n1[0] = nums[n];
                for(int i =0; i<nums.length-1;i++){
                    n1[i+1] = nums[i];
                }
            }

            for(int i =0; i<n1.length;i++){
                System.out.print(n1[i] + " ");
            }
        }
        
    }

    public static void main(String[] args) {
        int nums[] = {3,2,1};
        nextPermutation(nums);
    }

}