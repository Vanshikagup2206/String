package String.Easy;

import java.util.*;

public class IsomorphicString {
  public boolean isomorphicString(String s, String t) {
     Map<Character, Character> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        if(s.length() != t.length())
            return false;
        for(int i = 0; i < s.length(); i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(map.containsKey(sChar)){
                if(map.get(sChar) != tChar)
                    return false;
            }else{
                if(set.contains(tChar))
                    return false;
                map.put(sChar,tChar);
                set.add(tChar);
            }
        }
        return true;
    }

  public static void main(String args[]) {
    String s = "egg", t = "add";
    IsomorphicString sol = new IsomorphicString();
    System.out.println(sol.isomorphicString(s, t));
  }
}