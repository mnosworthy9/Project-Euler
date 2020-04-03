public class P005_Division {
    public static void main(String[] args) {

        boolean divides = false;
        int num = 0;
        int nextNum = 0;

        while(!divides) {

            for(int i = 1; i <= 20; i++) {
                if( num % i != 0) {
                    nextNum = num;
                    break;
                }
            }

            if(num != nextNum) {
                break;
            } else {
                num += 20;
            }
        }
        System.out.println(num);
    }
}
