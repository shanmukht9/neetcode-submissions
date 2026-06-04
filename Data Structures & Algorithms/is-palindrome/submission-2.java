class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> ch = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
               ch.add(Character.toLowerCase(s.charAt(i)));
            }
        }
        int left = 0;
        int right = ch.size()-1;
        for(int i=0;i<ch.size();i++){
            if(ch.get(left).equals(ch.get(right))){
                left++;
                right--;
            }
            else{
                return false;
            }    
        }

        return true;
    }
}
