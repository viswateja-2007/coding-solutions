# Arranging Coins

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You have `n` coins and you want to build a staircase with these coins. The staircase consists of `k` rows where the `ith` row has exactly `i` coins. The last row of the staircase  **may be**  incomplete.

Given the integer `n`, return  *the number of  **complete rows**  of the staircase you will build*.

 

 **Example 1:** 

```
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

```

 **Example 2:** 

```
Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.

```

 

 **Constraints:** 

- 1 <= n <= 231 - 1

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 42.2 MB (beats 98.18%)  
**Submitted:** 2026-08-10T18:09:14.860Z  

```java
class Solution {
    public int arrangeCoins(int n) {
        return (int) (Math.sqrt(2) * Math.sqrt(n + 0.125) - 0.5);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/arranging-coins/)