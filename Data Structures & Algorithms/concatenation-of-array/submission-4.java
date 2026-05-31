class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = (nums.length);
        int[] out = new int[n*2];
        for(int i=0;i<(n);i++){
            out[i] = nums[i];
            out[n+i] = nums[i];
        }
        return out;
    }
}