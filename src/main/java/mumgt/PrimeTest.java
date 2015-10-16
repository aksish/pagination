package mumgt;

/**
 * Created by Aashis Khanal on 8/21/15.
 */
public class PrimeTest {
    /**
     *
     * @param start 5
     * @param end 25
     * @return
     */
    public static int primeCount(int start, int end){
        int count = 0;
        if(start<0 || start==2){
            start = 2;
            count++;
        }
        for(int i=start;i<=end;i++){
            for(int j=2;j<i;j++){
                if(j==i-1)
                    count = count + 1;
                boolean divisible = i%j==0;
                if(divisible)
                    break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(PrimeTest.primeCount(-10, 6));
    }
}
