class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character,Integer> maps = new HashMap<>();
        HashMap<Character,Integer> mapt = new HashMap<>();

        for(int i=0;i<maps.length();i++)
        {
            maps.put(maps.charAt(i),maps.getOrDefault(maps.charAt(i),0)+1);
            mapt.put(mapt.charAt(i),mapt.getOrDefault(mapt.charAt(i),0)+1);
        }
        return maps.equals(mapt);
    }
}
