package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
                int startNum = 1;
        int result = 1;
        while (startNum <= printToInclusive) {
                result *= startNum;
            startNum++;
        }
        System.out.println(result);

    }
}
