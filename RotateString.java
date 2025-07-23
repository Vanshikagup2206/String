package String;

public class RotateString {   
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length())
            return false;
        String extra = s + s;
        if(extra.contains(goal))
            return true;
        return false;
    }
    public static void main(String args[]){
        String s = "abcde", goal = "cdeab";
        RotateString sol = new RotateString();
        System.out.println(sol.rotateString(s,goal));
    }
}