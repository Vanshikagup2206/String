package String.Medium;

public class MaxParenthesisDepth {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                depth++;
                maxDepth = Math.max(maxDepth,depth);
            }
            else if(ch == ')')
                depth--;
        }
        return maxDepth;
    }
    public static void main(String args[]){
        String s = "(1+(2*3)+((8)/4))+1";
        MaxParenthesisDepth sol = new MaxParenthesisDepth();
        System.out.println(sol.maxDepth(s));
    }
}