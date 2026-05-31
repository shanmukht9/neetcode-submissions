class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pqq = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());

        pqq.addAll(map.entrySet());


        int[] result = new int[k];
        for(int i=0;i<k;i++){
            result[i] = pqq.poll().getKey();
        }
        return result;
    }
}
