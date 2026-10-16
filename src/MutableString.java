public class MutableString {
    public static void main(){
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
        sb.append("y");

        System.out.println(sb);
        sb.insert(3,"3");

        System.out.println(sb);
        System.out.println(sb.charAt(0));

        sb.setCharAt(0,'y');
        System.out.println(sb);
    }

}
