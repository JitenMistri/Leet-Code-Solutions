class Solution {
    public int longestSubarray(int[] nums, int k) {
       int left = 0; int right = 0;
       int n = nums.length;
       int sum = nums[0];
       int maxLen = 0;
       while(right < n){
        if(sum > k){
            sum -= nums[left];
            left++;
        }
        if(left <= right && sum == k){
            maxLen = Math.max(maxLen, right - left + 1);
        }
        right++;
        if(right < n) sum += nums[right];
       }
        return maxLen;
    }
}
