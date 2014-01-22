package prateekj.unixtools.tail;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by prateekj on 1/9/14.
 */
public class TailOperationTest {
    @Test
    public void testGetOptions() throws Exception {
        String[] temp = {"a.txt"};
        TailOperation op = new TailOperation();
        Operations expected = new Operations() ;

        expected.fileName = "a.txt";
        Operations actual = op.getOptions(temp);

        assertEquals(actual.fileName, expected.fileName);

    }

    @Test
    public void testGetOptions2() throws Exception {
        String[] temp = {"a.txt","-n5"};
        TailOperation op = new TailOperation();
        Operations expected = new Operations() ;

        expected.fileName = "a.txt";
        expected.lineNo = 5;
        Operations actual = op.getOptions(temp);

        assertEquals(actual.fileName, expected.fileName);
        assertEquals(expected.lineNo,actual.lineNo);
    }

    @Test
    public void get_last_ten_lines() throws Exception {
        String temp = "A\nB\nC\nD\nE\nF\nG\nH\nI\nJ\nK";
        String expected = "B\n" +
                "C\n" +
                "D\n" +
                "E\n" +
                "F\n" +
                "G\n" +
                "H\n" +
                "I\n" +
                "J\n" +
                "K";
        TailOperation op = new TailOperation();

        String actual = op.getLines(temp,10);
        assertEquals(actual,expected);
    }

    @Test
    public void get_last_five_lines() throws Exception {
        String temp = "A\nB\nC\nD\nE\nF\nG\nH\nI\nJ\nK";
        String expected = "G\n" +
                "H\n" +
                "I\n" +
                "J\n" +
                "K";
        TailOperation op = new TailOperation();

        String actual = op.getLines(temp,5);
        assertEquals(actual,expected);
    }

    @Test
    public void test_should_get_all_five_lines_which_are_smaller_than_as_requested() throws Exception {
        String temp = "A\nB\nC\nD\nE";
        String expected = "A\n" +
                "B\n" +
                "C\n" +
                "D\n" +
                "E";
        TailOperation op = new TailOperation();

        String actual = op.getLines(temp,10);
        assertEquals(actual,expected);
    }
}
