class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}
