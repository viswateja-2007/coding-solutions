# Trapping Rain Water

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given `n` non-negative integers representing an elevation map where the width of each bar is `1`, compute how much water it can trap after raining.

 

 **Example 1:** 

```
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

```

 **Example 2:** 

```
Input: height = [4,2,0,3,2,5]
Output: 9

```

 

 **Constraints:** 

- n == height.length
- 1 <= n <= 2 * 104
- 0 <= height[i] <= 105

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 59.38%)  
**Memory:** 48.7 MB (beats 22.66%)  
**Submitted:** 2026-07-31T18:25:40.366Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/trapping-rain-water/)