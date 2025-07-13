class Solution {
    public int maxDepth(String s) {
        int res = 0;
        int current = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                current++;
                res = Math.max(res,current);
            }
            if(s.charAt(i)==')'){
                current--;
            }
        }
        return res;
    }
}