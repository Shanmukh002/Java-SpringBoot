import java.util.*;
class rev{
    void skipEven(int n){
        int r=0;
        while(n!=0){
            if((n%10)%2==0){
                n/=10;
                continue;
            }
            else{
                r=r*10 + (n%10);
                n/=10;
            }
        }
        System.out.println(r);
    }
}
class Q2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        rev q = new rev();
        q.skipEven(in.nextInt());
    }
}
