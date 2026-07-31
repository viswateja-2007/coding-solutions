class Solution {
    public int trap(int[] height) {
        int min = 0;
        int trappedWater = 0;
        int width = 1;

        int n = height.length;

        int left = height[0];
        int right = height[n - 1];

        int leftmax[] = new int[n];
        int rightmax[] = new int[n];

        for(int i = 0; i < n; i++){
            if(height[i] >= left){
                left = height[i];
                leftmax[i] = height[i];
            }

            else{
                leftmax[i] = left;
            }
        }

        for(int i = n - 1; i >= 0; i--){
            if(height[i] >= right){
                right = height[i];
                rightmax[i] = height[i];
            }

            else{
                rightmax[i] = right;
            }
        }


        for(int i = 0; i < n; i++){
            min = Math.min(leftmax[i], rightmax[i]);
            int water = (min - height[i])*width;
            trappedWater += water;
        }

        return trappedWater;

        
    }
}