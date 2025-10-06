class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length(); 
        int start = 0;
        int end = 0;
        int max = 0;
        HashSet<Character> hs = new HashSet<>();
        while(end < n) {
            if(!hs.contains(s.charAt(end))) {
                hs.add(s.charAt(end));
                end++;
                max = Math.max(max,end-start);
            }
         else {
           
                hs.remove(s.charAt(start));
                start++;
            
        }
        }
        return max;
    }
}