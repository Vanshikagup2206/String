package String.Easy;

import java.util.Arrays;
public class IsAnagram {  
    public boolean anagramStrings(String s, String t) {
        if(s.length() != t.length())
            return false;
        char[] charS = s.toCharArray();
        Arrays.sort(charS);
        String sortedS = new String(charS);

        char[] charT = t.toCharArray();
        Arrays.sort(charT);
        String sortedT = new String(charT);

        return sortedS.equals(sortedT);
    }
    public static void main(String args[]){
        String s = "anagram", t = "nagaram";
        IsAnagram sol = new IsAnagram();
        System.out.println(sol.anagramStrings(s,t));
    }
}