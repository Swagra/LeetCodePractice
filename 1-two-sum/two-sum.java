class Solution {
    public int[] twoSum(int[] arr, int target) {
        int num[] = new int[2];
        for(int i=0;i<arr.length;i++) {
            for(int j = i+1;j<arr.length;j++) {
                if(arr[i] + arr[j] == target) {
                  num[0] = i;
                  num[1] = j;
                }
            }
        }
        return num;
    }
}