class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character,Integer> s = new HashMap<>();
        HashMap<Character,Integer> t = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            s.put(s.charAt(i),s.getOrDefault(s.charAt(i),0)+1);
            t.put(t.charAt(i),t.getOrDefault(t.charAt(i),0)+1);
        }
        return s.equals(t);
    }
}
