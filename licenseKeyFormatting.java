license key formatting

class Solution {
    public String licenseKeyFormatting(String S, int K) {
        String newStr=S.replaceAll("-","").toUpperCase();
        StringBuilder sb=new StringBuilder();
        int count=0;
        for(int i=newStr.length()-1;i>=0;i--){
            sb.append(newStr.charAt(i));
            count++;
            if(count==K && i!=0){
                sb.append("-");
                count=0;
            }
            
        }
        sb.reverse();
        return sb.toString();
        
    }
}