class Solution {
    public void reverseArray(int arr[]) {
        int end =  arr.length - 1;
        
        for(int i = 0; i < arr.length/2 ; i++){
            int temp = arr[i];
            arr[i] = arr[end];
            arr[end] = temp;
            
            end--;
        }
       
        
    }
}