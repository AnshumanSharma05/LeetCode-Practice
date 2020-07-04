Contains Duplicates

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        // Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        Set<Integer> set=new HashSet<>();
        for(int elem:nums){
            set.add(elem);
        }
        if(set.size()==nums.length){
            return false;
        }
        else{return true;}
        
    }
}