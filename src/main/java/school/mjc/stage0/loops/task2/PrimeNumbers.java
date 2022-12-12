package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        int j;
        boolean isPrime = true;

        while (i<= printToInclusive){
            int sqrt = (int) Math.sqrt(i);
            for (j = 2; j <= sqrt; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) System.out.println(i);
            isPrime = true;
            i++;
        }
    }
}