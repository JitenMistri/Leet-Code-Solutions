class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length())    return false;
        Map<Character, Integer> s_string = new HashMap<>();
        Map<Character, Integer> t_string = new HashMap<>();

        for(Integer i=0;i<s.length();i++){
            if (s_string.put(s.charAt(i), i) != t_string.put(t.charAt(i), i))
                return false;
        }
        return true;

    }
}