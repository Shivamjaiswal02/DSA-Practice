class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder("");
        String[] words = s.trim().split("\\s+");
        for(int i=0;i<words.length;i++)
        {
            String word = words[i];
            for(int j=word.length()-1;j>=0;j--)
            {
            char ch = word.charAt(j);
            sb.append(ch);
            }
             if(i<words.length-1)
            {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}