import java.util.*;

public class stringCompression {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = in.nextLine();
        StringBuilder s = new StringBuilder();
        int cnt=0;
        for (int i = 0; i < str.length(); i++) {
            if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                cnt++;
            }else{
                s.append(str.charAt(i));
                if(cnt+1>1)
                    s.append(cnt+1);
                cnt=0;
            }

        }
        System.out.println("compressed string: "+ s);
    }
}
