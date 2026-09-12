class Solution {
public:
    bool isPalindrome(int x) {
        int temp = x;
        long long num = 0;
        while(x > 0){
            int lastDigit = x % 10;
            num = num * 10 + lastDigit;
            x = x / 10;
        }

        if(num == temp){
            return true;
        }

        else{
            return false;
        }
    }
};