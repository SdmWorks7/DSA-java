import java.util.Scanner;

public class camelCase {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = in.next();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(i!=0 && Character.isUpperCase(ch))
                System.out.println();
            System.out.print(ch);
        }
    }
}
