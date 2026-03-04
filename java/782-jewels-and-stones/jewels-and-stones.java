class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<jewels.length();i++)
        {
            char ch = jewels.charAt(i);
            if(map.containsKey(ch))
            {
                map.put(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        int count=0;
        for(int i=0;i<stones.length();i++)
        {
            char ch = stones.charAt(i);
            if(map.containsKey(ch))
            {
                count++;
            }
        }
        return count;
    }
}