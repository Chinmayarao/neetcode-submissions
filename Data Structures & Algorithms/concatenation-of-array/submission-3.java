class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = (nums.length)*2;
        int[] out = new int[n];
        for(int i=0;i<(n/2);i++){
            out[i] = nums[i];
            out[n/2+i] = nums[i];
        }
        return out;
    }
}