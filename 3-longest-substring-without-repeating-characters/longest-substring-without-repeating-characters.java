class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int max = 0;
        int left = 0;
        for(int right=0; right<s.length() ;right++){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            int len = right-left+1;
            max = Math.max(max,len);             
        }
        return max;
    }
}