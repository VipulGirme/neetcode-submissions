class Solution {
    public int[] sortArray(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        quickSort(nums, low, high);
        return nums;
    }
    void quickSort(int [] nums, int low, int high) {
        if(low < high) {
            int partition_index = partition(nums, low, high);
            quickSort(nums, low, partition_index - 1);
            quickSort(nums, partition_index+1, high);

        }
    }
    private int partition(int [] nums, int begin, int last) {
        int pivot = nums[last];
        int i = begin - 1;

        for (int j = begin; j < last; j++) {
            if(nums[j] <= pivot) {
                i++;
                int swapTerm = nums[i];
                nums[i] = nums[j];
                nums[j] = swapTerm;
            }
        }

        int swap = nums[i+1];
        nums[i+1] = nums[last];
        nums[last] = swap;
        return i+1;
    }
}