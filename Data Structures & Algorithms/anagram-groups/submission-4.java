class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sortdS = new String(charArray);

            if(map.containsKey(sortdS)){
                map.get(sortdS).add(s);
            }else{
                map.put(sortdS,new ArrayList<>());
                map.get(sortdS).add(s);
            }
        }

        return new ArrayList<>(map.values());
    }
}
