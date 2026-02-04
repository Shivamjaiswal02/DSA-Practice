class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        String[] str = s.split(" ");
        if (pattern.length() != str.length) return false;
        for(int i=0;i<pattern.length();i++)
        {
            char ch = pattern.charAt(i);
            String ch2 = str[i];
            if(map.containsKey(ch))
            {
                if(!map.get(ch).equals(ch2)) return false;
            }
            else
            {
                map.put(ch,ch2);
            }

            if(map2.containsKey(ch2))
            {
                if(map2.get(ch2)!=(ch)) return false;
            }
            else
            {
                map2.put(ch2,ch);
            }
        }
        return true;
    }
}