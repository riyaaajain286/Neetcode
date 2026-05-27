class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        if(n==0) return 0;
        int max=1;
        int ele=0;
        for(int i=0;i<n;i++){
            int c=1;
            ele=nums[i]+1;
            for(int j=i+1;j<n;j++){
                if(nums[j]==ele){
                    c++;
                    ele=nums[j]+1;

                }

            }
            max=Math.max(c,max);
        }
        return max;
    }
}
