class Solution {
    public int smallestNumber(int n, int t) {

        while(true){
            if(digitProduct(n) % t == 0){
                return n;
            }

            n++;
        }
        
    }

    private int digitProduct(int n){
        int temp = n;
        int prod = 1;
        while(temp > 0){
            prod *= (temp % 10);
            temp = temp / 10;
        }

        return prod;
     }
}