class Solution {
    public boolean hasDuplicate(int[] nums) {

        List<Integer> seen = new ArrayList<>();

        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            else
                seen.add(num);
        }
        return false;
        
    }
}