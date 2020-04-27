public class P007_10001stPrime {
    public static void main(String[] args){
        long count = 3;
        int sum = 1;
        while (true){
            if(prime(count)){
                sum++;
                if(sum==10001){
                    break;
                }
            }
            count+=2;
        }
        System.out.print(count);
    }
    static boolean prime(long number) {
            for (long i = 2L; i < number; ++i) {
                if (number % i == 0) {
                    return false;
                }
        }
        return true;
    }
}
