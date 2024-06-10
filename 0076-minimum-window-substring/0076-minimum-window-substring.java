class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";
        int si=0;
        int ei=0;
        int ns=s.length();
        int nt=t.length();
        int len=(int)1e9;
        int count=t.length();
        int gsi=0;
        int freq[]=new int[128];
        for(char ch:t.toCharArray())
         freq[ch]++;
         while(ei<ns){
             if(freq[s.charAt(ei++)]-->0){
                 count--;
             }
             while(count==0){
                 if(ei-si<len){
                     len=ei-si;
                     gsi=si;
                 }
                 if(freq[s.charAt(si++)]++==0)count++;
             }
         }
         return len==(int)1e9?"":s.substring(gsi,gsi+len);
    }
}