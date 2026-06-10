class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())  return false;
       int left=0;
        int freq1[]=new int[26];
        int freq2[]=new int[26];
        for(int right=0;right<s1.length();right++){
            freq1[s1.charAt(right)-'a']++;
            freq2[s2.charAt(right)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)){
            return true;
        }
        for(int right=s1.length();right<s2.length();right++){
            freq2[s2.charAt(left)-'a']--;
            freq2[s2.charAt(right)-'a']++;

        
        if(Arrays.equals(freq1,freq2)){
              return true;
        }
        left++;
        }
        return false;
            }
}
