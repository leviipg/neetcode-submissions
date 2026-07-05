class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] letters1 = s.toCharArray();
        char[] letters2 = t.toCharArray();

        Arrays.sort(letters1);
        Arrays.sort(letters2);

        if (Arrays.equals(letters1, letters2)){
            return true;
        }
        else{
            return false;
        }
    }
}