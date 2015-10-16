package mumgt;

/**
 * Created by Aashis Khanal on 8/7/15.
 */
public class PerfectSquare {
    public long nextPerfectSquare(int i){
        if(i==0)
            return 1;
        else if(i==1)
            return 4;
        else if(i<0)
            return 0;
        int a = (int)Math.ceil(Math.sqrt(i));
        System.out.println(a*a);
     return a*a;
    }

    public static void main(String[] args) {
        new PerfectSquare().nextPerfectSquare(3);
    }
}
