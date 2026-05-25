class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int m=set.size();
        int p=nums.length;
       return m!=p;
    }
}