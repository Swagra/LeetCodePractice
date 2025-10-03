class Solution {
     public int slove(int n) {
        if(n<0) return 0;
        if(n==0) return arr[n] = 1;
        if(arr[n] != -1 ) return arr[n];
        int step_one = slove(n-1);
        int step_two = slove(n-2);
        return arr[n] = step_one + step_two;
     }
     int arr[];
    public int climbStairs(int n) {
         arr = new int[n+2];
        Arrays.fill(arr,-1);
        return  slove(n);
    }
}