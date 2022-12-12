package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int count = -1;
        int multiplyNumber = 0;
        while (count<Math.abs(multiplyByAndToInclusive)){
            if(multiplyByAndToInclusive == 0){
                break;
            }
            System.out.println(multiplyNumber);
            multiplyNumber = multiplyNumber + multiplyByAndToInclusive;
            count++;
        }
    }
}
