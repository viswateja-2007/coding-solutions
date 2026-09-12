# Palindrome Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer `x`, return `true` if `x` is a  **palindrome**, and `false` otherwise.

 

 **Example 1:** 

```
Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.

```

 **Example 2:** 

```
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

```

 **Example 3:** 

```
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

```

 

 **Constraints:** 

- -231 <= x <= 231 - 1

 

 **Follow up:**  Could you solve it without converting the integer to a string?

## Solution

**Language:** C++  
**Runtime:** 10 ms (beats 5.83%)  
**Memory:** 8.7 MB (beats 35.90%)  
**Submitted:** 2026-09-12T04:25:35.798Z  

```cpp
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
```

---

[View on LeetCode](https://leetcode.com/problems/palindrome-number/)