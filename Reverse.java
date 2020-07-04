


class Solution {
    public int reverse(int x) {
        int out=0;
        while(x!=0){
            int temp=x%10;
            x=x/10;
            if (out > Integer.MAX_VALUE/10 || (out == Integer.MAX_VALUE / 10 && temp > 7)) return 0;
            if (out < Integer.MIN_VALUE/10 || (out == Integer.MIN_VALUE / 10 && temp < -8)) return 0;
           
            out=out*10+temp;
            
        }
        
        return out;
    }
}