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

    @Test
    public void sort_D_B_A_C_should_give_A_B_C_D() throws Exception {
        String input = "D\nB\nA\nC";
        String expected = "A\nB\nC\nD";
        Options options = new Options();
        options.reverse = false;
        SortOperation so = new SortOperation();

        String actual  = so.sortContent(input,options);

        assertEquals(expected,actual);
    }

    @Test
    public void sort_D_B_A_C_should_give_D_C_B_A() throws Exception {
        String input = "D\nB\nA\nC";
        String expected = "D\nC\nB\nA";
        Options options = new Options();
        options.reverse = true;
        SortOperation so = new SortOperation();

        String actual  = so.sortContent(input,options);

        assertEquals(expected,actual);
    }


}
