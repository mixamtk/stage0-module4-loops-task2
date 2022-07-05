package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
       int startNum = 0;
        int startnumWhile = 1;
        int result = 1;
        while (startNum <= printToInclusive) {
            while (startnumWhile <= startNum) {
                result *= startnumWhile;
            startnumWhile++;
            }
            startNum++;
            System.out.println(result);
        }

    }
}
