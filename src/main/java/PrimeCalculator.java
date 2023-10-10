import java.util.stream.IntStream;

class PrimeCalculator {

    int nth(int nth) {
        if (nth < 1)
            throw new IllegalArgumentException();
        int num = 2;
        int count = 1;
        while (count < nth) {
            num++;
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (!isPrime)
                continue;
            count++;
        }
        return num;
    }

}
