class Solution {
    public boolean isPalindrome(int x) {
       
        String s = Integer.toString(x);
        char arr[] = s.toCharArray();
        int a=0;
        int b=arr.length-1;
        while(a<b){
            if(arr[a]!=arr[b]){
                return false;
            }
            a++;
            b--;
            
        }
        return true;
    }
}