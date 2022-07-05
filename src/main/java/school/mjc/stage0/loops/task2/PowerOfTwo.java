package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power >= 0 ){
            int startNum = 0;
            int startnumWhile = 0;
            int result = 1;
        while (startNum <= power) {
            while (startnumWhile < startNum) {
                result *= 2;
            startnumWhile++;
            }
            startNum++;
            System.out.println(result);
        }} else {
            System.out.println("too much power");}
    }
}
