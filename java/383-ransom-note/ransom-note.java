class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            char ch = magazine.charAt(i);
            if(map1.containsKey(ch))
            {
                map1.put(ch,map1.get(ch)+1);
            }
            else
            {
                map1.put(ch,1);
            }
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            char ch = ransomNote.charAt(i);
            if(!map1.containsKey(ch))
            {
                return false;
            }
            else
            {
               map1.put(ch,map1.get(ch)-1);
            }
        }
        for(Character key:map1.keySet())
        {
            if(map1.get(key)<0)
            {
                return false;
            }
        }
        return true;
    }
}