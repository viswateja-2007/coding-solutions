class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
        int count = 0;
        int curr = 0;

        for(int i = 0; i < n; i++){
            curr = nums[i];
            for(int j = 0; j < n; j++){
                if(curr == nums[j]){
                    count++;
                }
            }

            if(count > (n / 2)){
                return curr;
            }

            count = 0;

        }

        return 0;
        
    }


}