class Solution {
    public int removeDuplicates(int[] nums) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        for(Integer i : nums) {
            hs.add(i);
        }
         
        int i=0;
        for(Integer s : hs) {
            nums[i] = s;
            i++;
        }
        return hs.size();
    }
}