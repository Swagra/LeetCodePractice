class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s = new StringBuilder();
        int n = strs[0].length();
        for(String s1 : strs) {
             n = Math.min(n,s1.length());
        }
        for(int i=0;i<n;i++) {
            char c = strs[0].charAt(i);
            for(int j=1;j<strs.length;j++) {
                if(strs[j].charAt(i) != c) {
                    return s.toString();
                }
            }
            s.append(c);
        }
        return s.toString(); 
    }
}