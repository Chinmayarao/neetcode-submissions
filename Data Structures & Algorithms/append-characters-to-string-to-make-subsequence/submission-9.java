class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0; // pointer for s
        int j = 0; // pointer for t
        int tLength = t.length();

        while (i < s.length() && j < tLength) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }

        return tLength - j;
    }
}