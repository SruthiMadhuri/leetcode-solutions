class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int[] merged = new int[m + n];
        int i = 0, j = 0, count = 0;
        while (i < m && j < n){
            if (nums1[i] < nums2[j]) {
                merged[count++] = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                merged[count++] = nums2[j++];
            } else {
                merged[count++] = nums1[i++];
                merged[count++] = nums2[j++];
            }
        }
        while (i < m) {
            merged[count++] = nums1[i++];
        } 
        while (j < n) {
            merged[count++] = nums2[j++];
        }
        if ((m + n) % 2 == 0) {
            int mid1 = (m + n) / 2 -1, mid2 = (m + n)/2;
            return (merged[mid1] + merged[mid2]) / 2.0;  
        } else {
            int mid = (m + n) / 2;
            return merged[mid];
        }
    }
}