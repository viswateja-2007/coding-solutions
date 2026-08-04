class Solution {
    int majorityElement(int arr[]) {
        int count = 0;
        int candidate = 0;

        // Step 1: Find candidate
        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Step 2: Verify candidate
        count = 0;
        for (int num : arr) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        }

        return -1;
    }
}