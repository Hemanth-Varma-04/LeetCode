class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0||strs==null){
            return "";
        }
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<strs[0].length();i++){//to know the length of the variable at the place of 0
        char ch = strs[0].charAt(i);
        for(int j=1;j<strs.length;j++){
            if(i>=strs[j].length()||strs[j].charAt(i)!=ch){/*Let’s walk through the first few steps manually:

i = 0:
ch = 'f'

'f' == 'f' in all → OK ✅

i = 1:
ch = 'l'

'l' == 'l' in all → OK ✅

i = 2:
ch = 'o'

"flight".charAt(2) = 'i' ≠ 'o' → mismatch ❌ → return "fl"*/
                return ans.toString();
            }
        }
        ans.append(ch);
        }
        return ans.toString();
    }
}