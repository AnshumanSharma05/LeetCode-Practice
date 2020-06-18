class Solution {
    public int pivotIndex(int[] nums) {
        
        int arr[]=new int[100];
        int n=nums.length;
        for(int i=0;i<n;i++){
            int left=0;
            int right=0;
            for(int k=0;k<i;k++){
                left=left+nums[k];
            }
            for(int j=i+1;j<n;j++){
                right=right+nums[j];
            }
            if(left==right){
                
                return i;
            }
            
        }
    return -1;    
    }
    
}