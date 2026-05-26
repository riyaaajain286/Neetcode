class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     map.put(nums[i],i);
        // }
        for(int j=0;j<n;j++){
            int c=target-nums[j];
            if(map.containsKey(c))
             return new int[]{map.get(c),j};
            map.put(nums[j],j);
        }
       return new int[]{-1,-1};
    }
}
