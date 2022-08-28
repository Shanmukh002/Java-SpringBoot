import java.util.*;

class  convertSec{
    void calc(int n){
        int h=0, s=0, m=0;
        h = n/3600;
        n %=3600;
        m = n/60;
        n %= 60;
        s = n;
        System.out.println(h+":"+m+":"+s);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        convertSec q = new convertSec();
        q.calc(in.nextInt());
    }
}
