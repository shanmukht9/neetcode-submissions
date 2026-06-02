class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> sets = new HashSet<>();
        for(int n:nums) sets.add(n);
//        System.out.println(sets);
        int count = 0;
        for(int n:nums){
            if(!sets.contains(n-1)){
                int maxcount =1;
                int currentnum = n;
                while(sets.contains(currentnum+1)){
                    currentnum++;
                    maxcount++;
                }
                if(maxcount>count) count = maxcount;
            }
        }
        if(nums.length==0) return 0;
        return count;

    }
}
