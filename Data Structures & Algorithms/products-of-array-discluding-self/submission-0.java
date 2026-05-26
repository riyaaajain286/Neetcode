class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n]; 
        
        for(int i=0;i<n;i++){
             int sum=1;
          for(int j=0;j<n;j++){
           
            if(j!=i){
                sum*=nums[j];
            }
          }
            ans[i]=sum;
        }
        return ans;
    }
}  
