import java.util.*;

class permutation46 {
    static List<List<Integer>> li = new ArrayList<>();
    public static List<List<Integer>> permute(int[] nums) {
        int ans[] = new int[nums.length];
        permutation(nums,ans , 0, nums.length);

        return li;
    }
    public static void permutation(int nums[], int arrAns[], int index, int n) {
        if (index == n) { 
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                temp.add(arrAns[i]);
            }
            li.add(temp);
            return; 
        }

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            int[] newarr = new int[nums.length - 1];

            for (int j = 0, k = 0; j < nums.length; j++) {
                if (j != i) {
                    newarr[k++] = nums[j];
                }
            }

            arrAns[index] = num;
            permutation(newarr, arrAns, index + 1, n);
        }
    }

    public static void main(String[] args) {
        int arr[] = {0,1};

        System.out.println(permute(arr));

    }
}