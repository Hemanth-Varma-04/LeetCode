class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int result[] = new int[n];
        for(int i=0;i<n;i++){
            result[(i+k)%n] = nums[i];//here the values of nums will be loaded to result according to formula positions 
        }
        for(int i=0;i<n;i++){
            nums[i] = result[i];
        }  
    }
}