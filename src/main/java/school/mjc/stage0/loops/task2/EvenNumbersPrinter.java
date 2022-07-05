package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int startNum = 1;
        while (startNum <= printTillInclusive) {
            if (startNum % 2 == 0)
            System.out.println(startNum);
            startNum++;
        }
    }
}
