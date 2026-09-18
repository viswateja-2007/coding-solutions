class Solution {
public:
    bool isPalindrome(int x) {
        string y = to_string(x);
        int start = 0;
        int end = y.size() - 1;

        while(start <= end){
            if(y[start] == y[end]){
                start++;
                end--;
            }

            else{
                return false;
            }
        }

        return true;

    }
};