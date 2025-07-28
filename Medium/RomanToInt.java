package String.Medium;

import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {
        int sum = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            int current = hm.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? hm.get(s.charAt(i + 1)) : 0;

            if (current < next)
                sum -= current;
            else
                sum += current;
        }
        return sum;
    }
    public static void main(String args[]){
        String s = "XLII";
        RomanToInt sol = new RomanToInt();
        System.out.println(sol.romanToInt(s));
    }
}