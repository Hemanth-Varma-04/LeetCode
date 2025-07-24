class Solution {
    public boolean check(int[] nums) {
        int deviation = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                deviation++;
            }
        }
        if(deviation<=1){
            return true;
        }
        else{
            return false;
        }
    }
}