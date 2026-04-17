class NextPermutation31{
    public static void nextPermutation(int[] nums) {
    int n = nums.length;
    int i = n - 2;

    // Step 1: find breakpoint
    while (i >= 0 && nums[i] >= nums[i + 1]) {
        i--;
    }

    // Step 2: swap
    if (i >= 0) {
        int j = n - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Step 3: reverse
    reverse(nums, i + 1, n - 1);
}

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

    public static void main(String[] args) {
        int nums[] = {2, 3, 1};
        nextPermutation(nums);

        for(int i = 0;i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
    }

}