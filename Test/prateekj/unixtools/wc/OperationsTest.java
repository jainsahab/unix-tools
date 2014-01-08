package prateekj.unixtools.wc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OperationsTest {

    @Test
    public void testGetOptions() throws Exception {
        String[] inputs = {"-c", "-l", "one.txt"};
        Options actual;
        Options expected = new Options();

        Operations op = new Operations();
        expected.chars = true;
        expected.lines = true;
        expected.filename = "one.txt";
        actual = op.getOptions(inputs);
        assertEquals(actual.filename,expected.filename);
        assertEquals(actual.chars,expected.chars);
        assertEquals(actual.lines,expected.lines);
        assertEquals(actual.words,expected.words);
    }

    @Test
    public void testCountLine() throws Exception {
        int expected = 2;
        int actual;
        String temp = "My Name is Prateek Jain\n Hello, ik's mike testing";

        Operations op = new Operations();
        actual = op.countLine(temp);

        assertEquals(actual, expected);
    }

    @Test
    public void testCountWords() throws Exception {
        int expected = 6 ;
        int actual;
        String temp = "My Name is Prateek Jain\nI";

        Operations op = new Operations();
        actual = op.countWords(temp);

        assertEquals(expected,actual);
    }

    @Test
    public void testCountCharacters() throws Exception {
        int expected = 7 ;
        int actual;
        String temp = "My Name";

        Operations op = new Operations();
        actual = op.countCharacters(temp);

        assertEquals(expected,actual);
    }
}
