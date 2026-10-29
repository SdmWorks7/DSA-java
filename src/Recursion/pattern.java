package Recursion;

public class pattern {
    static void patternPrint(int n, int row, int col){
        if(row>n) return;
        if(col>row){
            System.out.println();
            patternPrint(n, row+1, 1);
            return;
        }
        System.out.print("*");
        patternPrint(n,row, col+1);
    }
    static void main(String[] args) {
        patternPrint(10,1,1);
    }
}
