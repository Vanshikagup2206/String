package String.Medium;

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1)
            return "";
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++){
            //odd
            int left = i, right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if(right - left > end - start){
                    start = left;
                    end = right;
                }
                left--;
                right++;
            }
            //even
            left = i;
            right = i+1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                if(right - left > end - start){
                    start = left;
                    end = right;
                }
                left--;
                right++;
            }
        }
        return s.substring(start, end + 1);
    }
    public static void main(String args[]){
        String s = "babad";
        LongestPalindrome sol = new LongestPalindrome();
        System.out.println(sol.longestPalindrome(s));
    }
}