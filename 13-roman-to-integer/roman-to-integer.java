class Solution {
    public int romanToInt(String s) {
        int res = 0;
        for(int i=0;i<s.length();i++){
            int currVal = getvalue(s.charAt(i));
            int nextVal = (i+1<s.length())?getvalue(s.charAt(i+1)):0;
            if(currVal<nextVal){
                res -= currVal;
            }
            else{
                res += currVal;
            }
        }
        return res;
    }
    private int getvalue(char c){
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0; 
    }
}