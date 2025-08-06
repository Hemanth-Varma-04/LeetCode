class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            int compliment = target-nums[i];
            if(hm.containsKey(compliment)){
                return new int[] {hm.get(compliment),i};
            }
            else{
                hm.put(nums[i],i);
            }
        } 
        throw new IllegalArgumentException("No match");
    }
}