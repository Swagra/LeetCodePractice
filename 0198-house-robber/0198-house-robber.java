import java.lang.*;
class Solution {
    int t[];
    public int rob(int[] nums) {
        t = new int[101];
        Arrays.fill(t,-1);
        return slove(nums,0);
    }
    public int slove(int[] arr,int i) {
        if(i >= arr.length) return 0;
        if(t[i] != -1 ) return t[i];
        int steal = arr[i] + slove(arr ,i+2);
        int skip = slove(arr ,i+1);
        return t[i] = Math.max(steal,skip);
 }
}