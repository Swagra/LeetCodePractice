class Solution {
    public int searchInsert(int[] nums, int target) {
       TreeSet<Integer> ts = new TreeSet<>();
       for(Integer c : nums) {
        ts.add(c);
       }
       ts.add(target);
      int j=0;
      int n = -1;
      for(Integer i : ts) {
        if(i == target) {
            n = j;
        }
        j++;
      } 
 return n;
    }
}