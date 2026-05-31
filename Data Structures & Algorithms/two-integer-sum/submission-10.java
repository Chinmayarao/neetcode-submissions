class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        int sum=0;
        int[] temp = new int[2];
     for(int i=0; i<length; i++){
        for(int j=0; j<length; j++){
            if(j==i){
                continue ;
            }
            sum = nums[i] + nums[j];
            if(target == sum){
                temp[0]=i;
                temp[1]=j;
                return temp; 
            }
        }
        
     }
     return temp;
    }
}
