import java.util.*;

class DaysTOYear{
    void format(int n){
        int y=0, m=0, d=0;
        y = n/360;
        n %= 360;
        m = n/12;
        d = n%12;
        System.out.println(y+":"+m+":"+d);
    }
}

public class formatDays{
{
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    DaysTOYear fd = new DaysTOYear();
	    fd.format(in.nextInt());
	}
}

