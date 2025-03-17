class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();//Remove trailing space
        int idx=s.lastIndexOf(" ");//finding index of last " "
        return s.length()-idx-1;//length of last word
    }
}
