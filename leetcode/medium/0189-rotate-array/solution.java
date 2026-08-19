class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int start = 0;
        int end = n - k;

        int arr[] = new int[n];

        for(int i = 0; i < k; i++){
            arr[i] = nums[end];
            end++;
        }

        for(int i = k; i < n; i++){
            arr[i] = nums[start];
            start++;
        }

        for(int i = 0; i < n; i++){
            nums[i] = arr[i];
        }
    }
}