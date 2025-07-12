class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        //converting strings to arrays
        char[]sArr = s.toCharArray();
        char[]tArr = t.toCharArray();
        //sorting the array
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        //comparing sorted array
        return Arrays.equals(sArr,tArr);
    }
}