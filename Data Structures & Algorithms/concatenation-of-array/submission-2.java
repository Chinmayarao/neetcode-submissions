class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] out = new int[nums.length*2];
        for(int i=0;i<(n*2);i++){
            if(i>n-1){
                out[i]=nums[i-n];
                continue;
            }
            out[i]=nums[i];
        }
        return out;
    }
}