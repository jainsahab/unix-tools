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
}
