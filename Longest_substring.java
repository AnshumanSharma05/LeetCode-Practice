Longest Substring Without Repeating Characters
Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character> hashset=new HashSet();
        int a_pointer=0;
        int b_pointer=0;
        int max=0;
        while(b_pointer<s.length()){
            if(!hashset.contains(s.charAt(b_pointer))){
                hashset.add(s.charAt(b_pointer));
                b_pointer++;
                max=Math.max(hashset.size(),max);
            }
            else{
                hashset.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        return max;
    }
}