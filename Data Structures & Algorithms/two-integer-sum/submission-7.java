class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
     for(int i=0; i<length; i++){
        for(int j=0; j<length; j++){
            if(j==i){
                continue ;
            }
            int sum = nums[i] + nums[j];
            if(target == sum){
                int[] temp = new int[2];
                temp[0]=i;
                temp[1]=j;
                return temp; 
            }
        }
        
     }
     return new int[2];
    }
}
