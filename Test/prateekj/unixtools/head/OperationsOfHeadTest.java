package prateekj.unixtools.head;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by prateekj on 1/9/14.
 */
public class OperationsOfHeadTest {
    @Test
    public void testGetOptions() throws Exception {
        String[] temp = {"a.txt"};
        OperationsOfHead op = new OperationsOfHead();
        Operations expected = new Operations() ;

        expected.fileName = "a.txt";
        Operations actual = op.getOptions(temp);

        assertEquals(actual.fileName, expected.fileName);

    }

    @Test
    public void testGetOptions2() throws Exception {
        String[] temp = {"a.txt","-n5"};
        OperationsOfHead op = new OperationsOfHead();
        Operations expected = new Operations() ;

        expected.fileName = "a.txt";
        expected.lineNo = 5;
        Operations actual = op.getOptions(temp);

        assertEquals(actual.fileName, expected.fileName);
        assertEquals(expected.lineNo,actual.lineNo);
    }

    @Test
    public void test_should_return_2_line() throws Exception {
        String input = "My\nName\nis\nPrateek\nJain";
        String expected = "My\nName";
        OperationsOfHead op = new OperationsOfHead();

        String actual = op.getLine(input, 2);

        assertEquals(actual, expected);
    }

    @Test
    public void test_should_return_5_line_when_requesting_for_10() throws Exception {
        String input = "My\nName\nis\nPrateek\nJain";
        String expected = "My\nName\nis\nPrateek\nJain";

        OperationsOfHead op = new OperationsOfHead();

        String actual = op.getLine(input, 10);

        assertEquals(actual, expected);
    }

    @Test
    public void test_should_return_nothing() throws Exception {
        String input = "";
        String expected = "";

        OperationsOfHead op = new OperationsOfHead();

        String actual = op.getLine(input, 10);

        assertEquals(actual, expected);
    }
}
