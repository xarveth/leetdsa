class Solution {
    public boolean wordPattern(String pattern, String s) {

        String[] t2 = s.split(" ");

        if (pattern.length() != t2.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {

            char st1 = pattern.charAt(i);
            String word = t2[i];
            if (map.containsKey(st1)) {
                if (!map.get(st1).equals(word)) {
                    return false;
                }

            } else if (set.contains(word)) {
                return false;
            } else {
                map.put(st1, word);
                set.add(word);
            }
        }
        return true;
    }
}