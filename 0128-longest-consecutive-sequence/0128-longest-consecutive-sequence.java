class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int max = 0; 
        for(int x : set){
            if(!set.contains(x-1)){
                int current = x ; 
                int count = 1;

                while(set.contains(current + 1)){
                    current++;
                    count++;
                }
                max = Math.max(max, count);
            }
        }
        return max;
    }
}