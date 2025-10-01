class Solution {
     
    public int fib(int n) {
     if(n<=1) return n;
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);
        if(arr[n] != -1) return arr[n];
        else return arr[n] = fib(n-1) + fib(n-2); 
           
    }
}