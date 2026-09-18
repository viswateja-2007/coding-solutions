class Solution {
  public:
    int getSecondLargest(vector<int> &arr) {
        int max = arr[0];
        int n = arr.size();
        int max2 = -1;
        
        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        
        for(int i = 0; i < n; i++){
            if(arr[i] != max && arr[i] > max2){
                max2 = arr[i];
            }
        }
        
        return max2;
        
    }
};