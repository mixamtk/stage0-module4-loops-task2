package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
                int startNum = 2;
        while (startNum <= printToInclusive) {
            int k = 0;
            int startNumWhile = 1;
            while (startNumWhile <= startNum) {
                if (startNum % startNumWhile == 0)
                    k++;
                startNumWhile++;
            }
            if (k <= 2)
                System.out.println(startNum);
            startNum++;
        }
    }
}
