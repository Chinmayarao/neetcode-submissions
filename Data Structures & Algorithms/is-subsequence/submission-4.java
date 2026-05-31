class Solution {
    public boolean isSubsequence(String s, String t) {
        int index=-1;
        for (int i = 0; i < s.length(); i++) {
            if (t.contains(String.valueOf(s.charAt(i)))){
                int value = t.indexOf(s.charAt(i),index+1);
                if(value < index){
                    return false;
                }
                index = value;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}