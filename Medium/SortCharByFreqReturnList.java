package String.Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SortCharByFreqReturnList {
    public List<Character> frequencySort(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i),0)+1);
        }

        List<Character> list = new ArrayList<>(freq.keySet());

        list.sort((ch1,ch2) -> {
            if(freq.get(ch1) != freq.get(ch2))
                return freq.get(ch2) - freq.get(ch1);
            else
                return ch1 - ch2;
        });

        return list;
    }
    public static void main(String args[]){
        String s = "tree";
        SortCharByFreqReturnList sol = new SortCharByFreqReturnList();
        System.out.println(sol.frequencySort(s));
    }
}
