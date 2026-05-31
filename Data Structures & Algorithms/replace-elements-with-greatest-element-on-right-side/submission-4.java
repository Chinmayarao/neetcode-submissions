class Solution {
    public int[] replaceElements(int[] arr) {
        int length = arr.length;
        for(int i=1; i<length; i++){
            for(int j=i+1; j<length; j++){
                if(arr[i]<arr[j]){
                    arr[i]=arr[j];
                }
            }
            arr[i-1]=arr[i];
        }
        arr[length-1]=-1;
        return arr;
    }
}