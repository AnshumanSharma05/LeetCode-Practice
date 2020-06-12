Find Numbers with Even Number of Digits

class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        for (int j=0;j<nums.length;j++){
            int count=0;
            int k=nums[j];
            while(k>0){
                count++;
                k=k/10;
            }
            if(count%2==0){
                even++;
            }
        }
        return even;
    }
}