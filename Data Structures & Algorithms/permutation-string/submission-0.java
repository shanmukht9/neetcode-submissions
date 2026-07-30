class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // edge case
        if(s1.length() > s2.length()){
            return false;
        }
        //freq array for s1
        int[] targetfreq = new int[26];
        for(int i=0;i<s1.length();i++){
            targetfreq[s1.charAt(i)-'a']++;
        }

        // now freq array for the current window
        //build the first window
        //compare
        //slide the window
        //compare after every slide
        

    }
}
