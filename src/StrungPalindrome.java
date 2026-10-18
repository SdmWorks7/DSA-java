import java.util.*;
public class StrungPalindrome {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = in.nextLine();
        for (int i = 0; i < s.length()/2; i++) {
            char c1=s.charAt(i);
            char c2=s.charAt(s.length()-1-i);
            if(c1!=c2) {
                System.out.println("The string is not palindrome");
                break;
            }else if(i==(s.length()/2)-1){
                System.out.println("String is perfectly palindrome");
            }
        }
    }
}
