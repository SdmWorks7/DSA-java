import java.util.*;
public class CharacterFrequency {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] charray = new char[26];
        str = in.nextLine();
        for(int i = 0;i < str.length();i++){
            charray[str.charAt(i) - 'a']++;
        }
        int max = 0;
        char ch = 'a';
        for(int i = 0;i < 26;i++){
            if(max <= charray[i]){ //Choosing max Freq Character
                max = charray[i];
                ch = (char)(i + 'a');
            }
        }
    }
}
