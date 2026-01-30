class Solution {
    public int maxVowels(String s, int k) {
        int vowel =0;
        for(int i=0;i<k;i++)
        {
            char ch = s.charAt(i);
            if(ch =='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowel++;
            }
        }
        int max = vowel;
        for(int i=k;i<s.length();i++)
        {
            char ch = s.charAt(i);
            char ch2 = s.charAt(i-k);
            if(ch =='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u')
            {
                vowel++;
            }
            if(ch2 =='a'|| ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u')
            {
                vowel--;
            }
            max = Math.max(max,vowel);
        }
        return max;
    }
}