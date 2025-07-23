package String;

public class RemoveOutermostParenthesis {
    public String removeOuterParentheses(String s) {
        int depth = 0;
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                if(depth > 0)
                    result.append(s.charAt(i));
                depth++;
            }else{
                depth--;
                if(depth > 0)
                    result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String args[]){
        String s = "((()))";
        RemoveOutermostParenthesis sol = new RemoveOutermostParenthesis();
        System.out.println(sol.removeOuterParentheses(s));
    }
}