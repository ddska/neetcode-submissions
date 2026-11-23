class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int l = clean.length();
        for (int i = 0; i < l / 2; i++) {
            if (clean.charAt(i) != clean.charAt(l - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
