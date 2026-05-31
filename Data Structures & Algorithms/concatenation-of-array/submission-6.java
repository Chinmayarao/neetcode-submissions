class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] out = new int[n*2];
        for(int i=0;i<n;i++){
            int a = nums[i];
            out[i] = a;
            out[n+i] = a;
        }
        return out;
    }
}