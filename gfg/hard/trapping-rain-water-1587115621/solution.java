class Solution {
    public int maxWater(int arr[]) {
        int n = arr.length;
        int left = arr[0];
        int right = arr[n - 1];
        int leftMax[] = new int[n];
        int rightMax[] = new int[n];
        
        int vol = 0;
        
        for(int i = 0; i < n; i++){
            if(arr[i] >= left){
                left = arr[i];
                leftMax[i] = left;
            }
            
            else{
                leftMax[i] = left;
            }
        }
        
        
        for(int i = n - 1; i >= 0; i--){
            if(right <= arr[i]){
                right = arr[i];
                rightMax[i] = right;
            }
            
            else{
                rightMax[i] = right;
            }
        }
        
        for(int i = 0; i < n; i++){
            vol += (Math.min(leftMax[i], rightMax[i])) - arr[i];
        }
        
        return vol;
    }
}
