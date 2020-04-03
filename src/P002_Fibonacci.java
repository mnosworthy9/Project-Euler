public class P002_Fibonacci {
    public static void main(String[] args) {

        long first = 1;
        long second = 2;
        long sum = 2;

        while (first < 4000000 && second < 4000000) {
            first += second;
            second += first;
            if (first % 2 == 0 && first < 4000000) {
                sum += first;
            }
            if (second % 2 == 0 && second < 4000000) {
                sum += second;
            }
        }
        System.out.println(sum);
    }
}
