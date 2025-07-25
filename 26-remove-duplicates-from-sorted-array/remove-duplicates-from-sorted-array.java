class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            if(i<nums.length-1 && nums[i]==nums[i+1]){//skips the duplicates
                continue;
            }
            nums[count] = nums[i];//checks nums[0] = value at 0th position if yes count will increase
            count++;
        }
        return count;
    }
}