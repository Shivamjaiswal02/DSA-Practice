class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<allowed.length();i++)
        {
            char ch = allowed.charAt(i);
            set.add(ch);
        }
        int count=0;
        for(int i=0;i<words.length;i++)
        {
            boolean result = true;
            String letter = words[i];
            for(int j=0;j<letter.length();j++)
            {
                char ch = letter.charAt(j);
                if(!set.contains(ch))
                {
                    result = false;
                    break;
                }
            }
            if(result == true)
            {
                count++;
            }
        }
        return count;
    }
}