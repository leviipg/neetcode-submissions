class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()){ // If length isn't the same then there's no way it's an Anagram
            return false;
        }

        // Convert to Arrays to sort
        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();

        Arrays.sort(sSort);
        Arrays.sort(tSort);

        return Arrays.equals(sSort, tSort); // True if they're the same, false if not

    }
}
