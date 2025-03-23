class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length - 1;
        boolean isAsc = letters[start] < letters[end]; // True if sorted in ascending order

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAsc) { // Ascending order (always true for this problem)
                if (letters[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Descending order (not needed for this problem)
                if (letters[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return letters[start % letters.length]; // Wrap-around for circular behavior
    }
}
