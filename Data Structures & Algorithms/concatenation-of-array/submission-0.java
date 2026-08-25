class Solution {
    public int[] getConcatenation(int[] nums) {
        int [] arr = new int[2*nums.length];
        int counter = 0;
        for(int i = 0; i < nums.length;i++) {
            arr[counter] = nums[i];
            counter++;
        } 
         for(int i = 0; i < nums.length;i++) {
            arr[counter] = nums[i];
            counter++;
        } 
        return arr;
    }
}