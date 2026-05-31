class Solution {
    public boolean hasDuplicate(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = 0; j < nums.length - i - 1; j++) {

                // duplicate found
                if (nums[j] == nums[j + 1]) {
                    return true;
                }

                // swap
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        return false;
    }
}