public class P003_PrimeFactors {
    public static void main(String[] args) {

        long largest = 0L;
        long max = 600851475143L;
        long sum = 1L;

        for (long i = 2; i <= 600851475143L; ++i) {
            if (odd(i)) {
                if (prime(i) && factor(i)) {
                    System.out.println(i + " prime");
                    sum *= i;
                    System.out.println(sum + " sum");
                    if (sum == 600851475143L) {
                        largest = i;
                        break;
                    }
                }
            }
        }
        System.out.println("the largest prime factor is: " + largest);
    }

    static boolean prime(long number) {

        if (number < 10) {
            for (long i = 2L; i < number; ++i) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        else {
            for(int i = 2; i < 10; ++i) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;

    }

    static boolean odd(long number) {
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        return true;

    }

    static boolean factor(long number) {
        if (600851475143L % number == 0) {
            return true;
        }
        else
            return false;
    }
}
