class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int arrLen = 256;
        int[] arr = new int[arrLen];
        Arrays.fill(arr, -1);
        int l = 0;
        int maxLen = 0;

        for (int r = 0; r < n; r++) {

            if (arr[s.charAt(r)] >= l) {
                l = arr[s.charAt(r)] + 1;
            }

            arr[s.charAt(r)] = r;
            int len = r - l + 1;
            maxLen = Math.max(maxLen, len);

        }
        return maxLen;
    }
}
