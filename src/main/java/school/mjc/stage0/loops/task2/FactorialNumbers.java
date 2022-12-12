package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorialNumber = 1;
        int count = 1;
        System.out.println(count);
        while(factorialNumber <= printToInclusive){
            count = count * factorialNumber;
            System.out.println(count);
            factorialNumber++;
        }
    }
}
