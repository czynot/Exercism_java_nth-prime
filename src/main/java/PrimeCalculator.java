import java.util.stream.IntStream;

class PrimeCalculator {

    int nth(int nth) {
        if (nth < 1) throw new IllegalArgumentException();
        if (nth == 1) return 2;
        if (nth == 2) return 3;
        return IntStream.iterate(3, n -> n + 2)
                .filter(this::isPrime)
                .skip(nth - 2)
                .limit(1)
                .findFirst()
                .getAsInt();
    }
    private boolean isPrime(int n) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(i -> n % i == 0);
    }
}
