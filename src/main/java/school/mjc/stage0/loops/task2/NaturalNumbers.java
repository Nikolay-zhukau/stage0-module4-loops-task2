package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int naturalNumber = 0;
        int count = -1;
        while(count<lastPrinted){
            System.out.println(naturalNumber);
            naturalNumber++;
            count++;
        }
    }
}
