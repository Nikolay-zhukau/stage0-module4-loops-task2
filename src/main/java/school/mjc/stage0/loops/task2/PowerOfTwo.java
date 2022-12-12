package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int count = 0;
        int powerNumber =0;
        int two;
        if(power<0){
            System.out.println("too much power");
        }
        while (count <= power){
            if(power<0){
                System.out.println("too much power");
            }
            two = (int) Math.pow(2, powerNumber);
            powerNumber++;
            count++;
            System.out.println(two);
        }
    }
}
