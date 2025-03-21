import java.util.*;

class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        Map<Character, List<Integer>> charMap = new HashMap<>();

       
        for (int i = 0; i < s.length(); i++) {
            charMap.computeIfAbsent(s.charAt(i), k -> new ArrayList<>()).add(i);
        }

        int count = 0;
        for (String word : words) {
            if (isSubsequence(word, charMap)) {
                count++;
            }
        }

        return count;
    }

    private boolean isSubsequence(String word, Map<Character, List<Integer>> charMap) {
        int prevIndex = -1; // Track the last matched position in `s`

        for (char c : word.toCharArray()) {
            if (!charMap.containsKey(c)) return false; // Character not in `s`

            List<Integer> indices = charMap.get(c);
            
            // Binary search to find next valid position
            int nextIndex = findNextIndex(indices, prevIndex);
            if (nextIndex == -1) return false; // No valid position found
            
            prevIndex = indices.get(nextIndex);
        }

        return true;
    }

    private int findNextIndex(List<Integer> indices, int prevIndex) {
        int left = 0, right = indices.size();
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (indices.get(mid) > prevIndex) {
                right = mid; // Look for a smaller valid index
            } else {
                left = mid + 1; // Look for a larger index
            }
        }
        
        return left < indices.size() ? left : -1; // Return index if found
    }
}
