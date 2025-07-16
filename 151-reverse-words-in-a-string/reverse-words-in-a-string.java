class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].length()==0){//this will skip the empty strings
                continue;
            }
            if(res.length()==0){//If it’s the first word, just append it.
                res.append(arr[i]);
            }
            else{
                res.append(" ");//Otherwise, prepend a space and then the word.
                res.append(arr[i]);
            }
        }
       return res.toString();
    }
}