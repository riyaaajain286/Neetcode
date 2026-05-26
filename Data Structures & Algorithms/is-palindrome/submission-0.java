class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String str="";
        for(char ch:s.toCharArray()){
           if(Character.isLetterOrDigit(ch)){
            str+=ch;
           }
        }
        int i=0;
        int j=str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j))
             return false;
            i++;
            j--;
        }
        return true;
    }
}
