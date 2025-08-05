class Solution {
    public int missingNumber(int[] nums) {
       int sum = 0;
       int result = 0;
       int n = nums.length;
       int l = (n*(n+1))/2;
       for(int i=0;i<n;i++){
        sum += nums[i];
       }
      return result = l-sum;
    }
}