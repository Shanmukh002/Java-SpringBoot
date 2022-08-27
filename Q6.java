import java.util.*;
class power{
    void expo(int n){
        if(n%2==0){
            System.out.println((int)Math.pow(n,3));
        }
        else{
            System.out.println((int)Math.pow(n,2));
        }
    }
}
class Q6{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        power q = new power();
        q.expo(in.nextInt());
    }
}
