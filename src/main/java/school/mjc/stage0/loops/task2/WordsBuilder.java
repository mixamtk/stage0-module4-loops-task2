package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
            int startnumWhile = 0;
            StringBuilder result = new StringBuilder();
            while (startnumWhile < chars.length) {
                result.append(chars[startnumWhile]);
            startnumWhile++;
            }
            System.out.print(result);

    }
}
