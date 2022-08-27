import java.util.*
class son{
    void nums(int n){
        int sum = 0;
        int i=1;
        while(i<=n){
            System.out.print(i+" ");
            sum += i;
            i++;
        }
        System.out.println();
        System.out.println(sum);
    }
}
class Q5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        son q = new son();
        q.nums(in.nextInt());
    }
}
