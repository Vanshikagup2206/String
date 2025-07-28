package String.Medium;

public class SumOfBeauty {
    public int beautySum(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int[] freq = new int[26];
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                freq[ch - 'a']++;
                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;
                for (int f : freq) {
                    if (f > 0) {
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }
                sum += (maxFreq - minFreq);
            }
        }
        return sum;
    }
    public static void  main(String args[]){
        String s = "xyz";
        SumOfBeauty sol = new SumOfBeauty();
        System.out.println(sol.beautySum(s));
    }
}