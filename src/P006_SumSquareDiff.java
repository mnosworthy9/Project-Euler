public class P006_SumSquareDiff {
    public static void main(String[] argv){
        int sum1 = 0, sum2 = 0;
        for(int i = 1; i <= 100; i++){
            sum1 += i;
            sum2 += i * i;
        }
        int result = Math.abs(sum1*sum1-sum2);
        System.out.print(result);
    }
}
