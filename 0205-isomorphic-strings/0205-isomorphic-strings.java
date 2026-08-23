class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {

            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);

            // s character already has a mapping
            if (map.containsKey(ch1)) {
                if (map.get(ch1) != ch2) {
                    return false;
                }
            }

            // t character is already mapped to another s character
            else if (set.contains(ch2)) {
                return false;
            }

            // create new mapping
            else {
                map.put(ch1, ch2);
                set.add(ch2);
            }
        }

        return true;
    }
}