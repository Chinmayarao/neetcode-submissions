class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        StringBuilder str1 = new StringBuilder(s);
        StringBuilder str2 = new StringBuilder(t);

        int i = 0;

        while (i < str1.length()) {

            boolean found = false;

            for (int j = 0; j < str2.length(); j++) {

                if (str1.charAt(i) == str2.charAt(j)) {

                    str1.deleteCharAt(i);
                    str2.deleteCharAt(j);

                    found = true;

                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return str1.length() == 0 && str2.length() == 0;
    }
}