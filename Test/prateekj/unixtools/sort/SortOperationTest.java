package prateekj.unixtools.sort;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by prateekj on 1/10/14.
 */
public class SortOperationTest {
    @Test
    public void provide_input_without_reverse_option() throws Exception {
        String[] input = {"temp.txt"};
        Options expected = new Options();
        expected.fileName = "temp.txt";
        expected.reverse = false;
        SortOperation so = new SortOperation();

        Options actual = expected = so.getOptions(input);

        assertEquals(expected.fileName,actual.fileName);
        assertEquals(expected.reverse,actual.reverse);
    }

    @Test
    public void provide_input_with_reverse_option() throws Exception {
        String[] input = {"temp.txt","-r"};
        Options expected = new Options();
        expected.fileName = "temp.txt";
        expected.reverse = true;
        SortOperation so = new SortOperation();

        Options actual = expected = so.getOptions(input);

        assertEquals(expected.fileName,actual.fileName);
        assertEquals(expected.reverse,actual.reverse);
    }
}
