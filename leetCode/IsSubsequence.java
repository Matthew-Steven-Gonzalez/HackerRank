package leetCode;

class solution {

    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        int i = 0, j = 0;
        for (i = 0; i < t.length(); i++) {
            if (s.charAt(j) == t.charAt(i)) {
                j++;
            }
            if (j == s.length())
                return true;

        }

        return false;
    }
}