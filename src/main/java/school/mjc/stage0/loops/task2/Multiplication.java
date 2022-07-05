package school.mjc.stage0.loops.task2;
import static java.lang.Math.abs;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
                int startNum = 0;
        while (startNum <= abs(multiplyByAndToInclusive)) {
                System.out.println(startNum * multiplyByAndToInclusive);
            startNum++;
        }
    }
}
