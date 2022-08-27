import java.util.*;
class perfect{
    void factors(int n){
        int k=0;
        for(int j=6;;j++){
            int sum=0;
            for(int i=1;i<j;i++){
                if(j%i==0){
                    sum+=i;
                }
            }
            if(sum==j){
                System.out.println(++k +" "+ j);
            }
            if(k==n){
                break;
            }
        }
    }
}
class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        perfect q = new perfect(in.nextInt());
        q.factors();
    }
}
