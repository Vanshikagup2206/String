package String.Medium;

public class Atoi {
    public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        int sign = +1;
        int num = 0;
        while(i < n && s.charAt(i) == ' '){
            i++;
        }

        if(i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        while(i < n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i) - '0';
            if(num > Integer.MAX_VALUE / 10 || (num == Integer.MAX_VALUE / 10 && digit > 7)){
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            num = num * 10 + digit;
            i++;
        }
        return sign * num; 
    }
    public static void main(String args[]){
        String s = "42";
        Atoi sol = new Atoi();
        System.out.println(sol.myAtoi(s));
    }
}