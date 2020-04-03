public class P004_Palindrome {
    public static void main(String[] args) {

        int largest = 0;
        int number;
        for (int i = 999; i > 0; --i) {
            for (int j = 999; j > 0; --j) {
                number = i * j;
                String wordNumber = Integer.toString(number);

                for (int k = 0; k < wordNumber.length() - 1; ++k) {
                    if(wordNumber.length() % 2 == 0) {
                        int size = wordNumber.length();
                        int size2 = size - 1;
                        int size3 = size / 2;
                        int nothing = 0;
                        for (int l = 0; l <= size / 2 - 1; ++l) {
                            if (wordNumber.charAt(l) == wordNumber.charAt(size2 - l)) {
                                nothing++;
                            }
                            if (nothing == size3) {
                                int pal = Integer.parseInt(wordNumber);
                                if(pal > largest) {
                                    largest = pal;
                                }
                            }
                        }
                    }
                    else {
                        int size = wordNumber.length() - 1;

                        int nothing = 0;
                        for (int l = 0; l <= size / 2 - 1; ++l) {
                            if (wordNumber.charAt(l) == wordNumber.charAt(size-l)) {
                                nothing++;
                            }
                            if (nothing == size/2) {
                                int pal = Integer.parseInt(wordNumber);
                                if(pal > largest) {
                                    largest = pal;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(largest);
    }
}
