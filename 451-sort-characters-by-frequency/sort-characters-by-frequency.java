class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
          for(char ch:s.toCharArray()){
            freq.put(ch,freq.getOrDefault(ch,0)+1);
        }
         // Step 2: Store characters in a list for sorting
        List<Character>chars = new ArrayList<>(freq.keySet());
         // Step 3: Sort characters based on frequency in descending order
         Collections.sort(chars,(a,b)->freq.get(b)-freq.get(a));
         StringBuilder sb = new StringBuilder();
         for(Character ch:chars){
            for(int i=0;i<freq.get(ch);i++){
                sb.append(ch);
            }
         }return sb.toString();
    }
}