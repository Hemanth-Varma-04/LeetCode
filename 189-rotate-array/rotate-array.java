class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] arr=nums.clone();
        int ind=0;
        k=k%n;
        if(k<n){
            for(int i=n-k;i<n;i++){
                nums[ind]=arr[i];
                ind++;
            } 
            for(int i=0;i<n-k;i++){
                nums[ind]=arr[i];
                ind++;
            }
        }
       
    }
}