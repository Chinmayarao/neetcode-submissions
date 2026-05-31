class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] out = new int[nums.length*2];
        for(int i=0;i<(nums.length*2);i++){
            if(i>nums.length-1){
                out[i]=nums[i-nums.length];
                continue;
            }
            out[i]=nums[i];
        }
        return out;
    }
}