import java.util.*;
class table{
    void mulRiverse(int n){
        int i=10;
        while(i!=0){
            System.out.print(n+" x "+i+" = "+n*i+"\n");
            i--;
        }
    }
}
class Q4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        table q = new table();
        q.mulRiverse(in.nextInt());
    }
}
