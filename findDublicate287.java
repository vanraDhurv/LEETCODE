import java.util.*;
class findDublicate287{

    public static int findDuplicate(int[] nums) {

    HashSet <Integer> set = new HashSet<>();

    for(int i=0;i<nums.length;i++){
        if(set.contains(nums[i])){
            return nums[i];
        }
        else{
            set.add(nums[i]);
        }
    }
    return -1;
    }
    public static void main(String[] args) {
        int [] nums = {3,3};
        System.out.println(findDuplicate(nums));
    }
}
    
