class Solution {
    public int[] twoSum(int[] nums, int target) {
     for(int i=0; i<nums.length; i++){
        for(int j=0; j<nums.length; j++){
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
