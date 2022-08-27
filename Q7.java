import java.util.*;
class perfect{
    void factors(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("Perfect");
        }
        else{
            System.out.println("Not Perfect");
        }
    }
}
class Q7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        perfect q = new perfect();
        q.factors(in.nextInt());
    }
}
