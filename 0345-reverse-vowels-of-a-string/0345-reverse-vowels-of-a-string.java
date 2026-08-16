class Solution {
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        char[] arr = s.toCharArray();
        while (left < right) {
            if (!isVowel(s.charAt(left))) {
                left++;
            } else if (!isVowel(s.charAt(right))) {
                right--;
            } else if (isVowel(s.charAt(left)) && isVowel(s.charAt(right))) {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i'
                || ch == 'o' || ch == 'u';
    }
}