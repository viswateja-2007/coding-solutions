class Solution {
    public int trap(int[] height) {

        int vol = 0;
        int n = height.length;
        int left = height[0];
        int right = height[n - 1];

        int leftMax[] = new int[n];
        int rightMax[] = new int[n];

        for(int i = 0; i < n; i++){
            if(left <= height[i]){
                left = height[i];
                leftMax[i] = height[i];
            }

            else{
                leftMax[i] = left;
            }
        }

        for(int i = n - 1; i >= 0; i--){
            if(right <= height[i]){
                right = height[i];
                rightMax[i] = height[i];
            }

            else{
                rightMax[i] = right;
            }
        }

        for(int i = 0; i < n; i++){
            vol += (Math.min(rightMax[i], leftMax[i]) - height[i]);
        }

        return vol;

        
    }
}