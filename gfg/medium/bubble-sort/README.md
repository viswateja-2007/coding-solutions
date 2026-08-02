# bubble-sort

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

_Description not available._

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-02T14:29:31.688Z  

```java
class Solution {
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1 - i; j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/bubble-sort/1)