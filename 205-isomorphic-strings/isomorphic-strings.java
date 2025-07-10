class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        //now we create a HashMap 
        Map<Character,Character>charmappingmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);
            if(!charmappingmap.containsKey(original)){
                if(!charmappingmap.containsValue(replacement)){
                    charmappingmap.put(original,replacement);
                }
                else{
                    return false;
                }
            }
            else{//so here key should be paired to value && key it shouldn't already mapped for the other value
                char mappedcharacter = charmappingmap.get(original);
                if(mappedcharacter!=replacement)
                return false;
            }
        }
        return true;
    }
}