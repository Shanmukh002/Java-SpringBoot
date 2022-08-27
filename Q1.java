import java.util.*;
class seLarge{
    void showLarge(int a, int b, int c){
        if((a>=b && b>=c) || (c>=b && b>=a)){
            System.out.println(b);
        }
        else if((b>=a && a>=c) || (c>=a && a>=b)){
            System.out.println(a);
        }
        else{
            System.out.println(c);
        }
    }
}
class Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        seLarge q = new seLarge();
        int a=in.nextInt(), b=in.nextInt(), c=in.nextInt();
        q.showLarge(a,b,c);
    }
}

