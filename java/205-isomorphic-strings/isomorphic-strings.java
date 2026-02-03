class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mapST = new HashMap<>();
        HashMap<Character,Character> mapTS = new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            if(mapST.containsKey(chs))
            {
                if(mapST.get(chs) != cht) return false;
            }
            else
            {
                mapST.put(chs, cht);
            }
        }
         for(int i=0;i<t.length();i++)
        {
            char cht = t.charAt(i);
            char chs = s.charAt(i);
            if(mapTS.containsKey(cht))
            {
                if(mapTS.get(cht) != chs) return false;
            }
            else
            {
                mapTS.put(cht, chs);
            }
        }
        return true;
    }
}