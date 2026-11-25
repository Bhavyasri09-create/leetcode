class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
       reverse(0,s,n);
       }
       static void reverse(int i,char []s,int n){
         if(i>=n/2) return;
         char temp=s[i];
         s[i]=s[n-i-1];
         s[n-i-1]=temp;
         reverse(i+1,s,n);
       }
    }