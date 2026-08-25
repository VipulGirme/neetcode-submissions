class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;
        int [] arr = new int[2*n];
        for(int i = 0; i < n;i++) {
            int nextInd = i+n;
            arr[i] = nums[i];
            arr[nextInd] = nums[i];
        } 
        
        return arr;
    }
}