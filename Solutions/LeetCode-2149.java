class Solution {
    public int[] rearrangeArray(int[] nums) {

        int mid = nums.length/2;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[mid];
        int[] ans = new int[nums.length];
        
int index1 = 0, index2 = 0;

    for (int i = 0; i < nums.length; i++) {
        if (nums[i] < 0) {
            arr2[index1++] = nums[i];
        } else {
            arr1[index2++] = nums[i];
        }
    }

        for(int i=0;i<mid;i++){
            ans[2*i] = arr1[i];
            ans[2*i+1] = arr2[i];
        }
        return ans;
    }
}