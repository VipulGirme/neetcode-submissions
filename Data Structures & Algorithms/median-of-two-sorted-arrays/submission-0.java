class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int[] arr = new int[len1 + len2];
        int k = 0;
        for (int i = 0; i < len1; i++) {
            arr[k++] = nums1[i];
        }
        for (int i = 0; i < len2; i++) {
            arr[k++] = nums2[i];
        }
        Arrays.sort(arr);
        int total = arr.length;
        if (total % 2 == 1) {
            return (double) arr[total / 2];
        } else {
            int middle1 = arr[total / 2 - 1];
            int middle2 = arr[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        } 
    }
}
