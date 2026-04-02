class Solution {
    public int subarraysWithXorK(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,1);

        int prefix = 0;
        int count = 0;

        for(int i=0; i<nums.length; i++){
            
            prefix ^= nums[i];

            int target = prefix ^ k;

            count += mp.getOrDefault(target, 0);

            mp.put(prefix, mp.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}
