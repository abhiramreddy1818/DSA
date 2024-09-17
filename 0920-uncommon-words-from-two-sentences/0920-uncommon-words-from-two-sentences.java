class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String ,Integer> map = new HashMap<>();
        String ar[]=s1.split(" ");
        for(String s: ar){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ar=s2.split(" ");
        for(String s: ar){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()==1)
                list.add(entry.getKey());
        }       
         String  a[]= new String[list.size()];
         int i=0;
         for(String s: list){
            a[i++]=s;
         }
        return a;
    }
}