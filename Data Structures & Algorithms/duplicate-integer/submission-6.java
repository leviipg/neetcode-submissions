class Solution {
    public boolean hasDuplicate(int[] nums) {

        Arrays.sort(nums); // Sort the array so duplicates are next to each other

        for (int i = 1; i < nums.length; i++){ // Loop through each index except 0
            if (nums[i] == nums[i - 1]){ // Check every index with the one before to see if they're the same
                return true;
            }
        }
        return false;
    }
}