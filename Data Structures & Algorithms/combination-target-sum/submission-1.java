class Solution {
   public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list,new ArrayList<>(), nums,target, 0);
        return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int rem ,int start) {

        if(rem < 0) {
            return;
        }
        else if (rem == 0) {
            list.add(new ArrayList<>(tempList));
        } else {
            for (int i = start; i < nums.length;i++) {
                tempList.add(nums[i]);
                backtrack(list, tempList, nums,rem - nums[i], i);
                tempList.remove(tempList.size() - 1);
            }
        }

    }
}
