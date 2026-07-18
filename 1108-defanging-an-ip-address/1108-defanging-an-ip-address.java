class Solution {
    public String defangIPaddr(String address) {
        String IP = address.replace(".","[.]");
        return IP;
    }
}