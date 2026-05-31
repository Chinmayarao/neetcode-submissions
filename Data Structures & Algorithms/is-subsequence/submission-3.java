class Solution {
    public boolean isSubsequence(String s, String t) {
        int index=-1;
        for (int i = 0; i < s.length(); i++) {
            if (t.contains(String.valueOf(s.charAt(i)))){
                if(t.indexOf(s.charAt(i),index+1)<index){
                    return false;
                }
                index=t.indexOf(s.charAt(i),index+1);
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}