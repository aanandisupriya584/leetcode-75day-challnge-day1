class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        int temp=0;
        for(int i=0; i<nums.length;i++)
        {
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(i!=0){
                temp+=nums[i-1];
            }
            if(sum-temp-nums[i]==temp){
                return i;
            }
            
        }
        return -1;
    }
}
