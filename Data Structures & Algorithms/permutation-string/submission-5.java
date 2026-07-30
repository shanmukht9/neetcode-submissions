class Solution {
    public boolean checkInclusion(String s1, String s2) {
        // edge case
        if(s1.length() > s2.length()){
            return false;
        }
        //freq array for s1
        int[] targetfreq = new int[26];
        int[] windowfreq = new int[26];
        
        for(int i=0;i<s1.length();i++){
            targetfreq[s1.charAt(i)-'a']++;
        }


        
        //build the first wind

        for (int i = 0; i < s1.length(); i++) {
            windowFreq[s2.charAt(i) - 'a']++;
        }

        //compare
        if(Arrays.equals(targetfreq,windowfreq)){
            return true;
        }
        //slide the window

        for (int right = s1.length(); right < s2.length(); right++) {

            // Add new character
            windowFreq[s2.charAt(right) - 'a']++;

            // Remove leftmost character
            windowFreq[s2.charAt(right - s1.length()) - 'a']--;

            // Compare frequencies
            if (Arrays.equals(targetfreq, windowfreq)) {
                return true;
            }
        }

        return false;
        

    }
}
